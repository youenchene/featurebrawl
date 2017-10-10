package com.saagie.tooling.featurebrawl.infra.adapters.secondary

import com.mongodb.ServerAddress
import com.mongodb.client.model.UpdateOptions
import com.patternity.annotation.designpattern.Adapter
import com.saagie.tooling.featurebrawl.domain.ports.secondary.FeatureRecords
import com.saagie.tooling.featurebrawl.infra.adapters.secondary.dto.FeatureMongoRecord
import com.saagie.tooling.featurebrawl.domain.Feature
import com.saagie.tooling.featurebrawl.domain.Vote
import org.bson.Document
import org.bson.types.ObjectId
import org.litote.kmongo.*
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Repository

@Repository
@com.patternity.annotation.ddd.stereotype.Repository
@Adapter
class FeatureRecordsMongoRepository(@Value("\${kmongo.host}")
                               val host:String,
                                    @Value("\${kmongo.port}")
                               val port:Int): FeatureRecords {



    val client = KMongo.createClient(ServerAddress(host,port))
    val database = client.getDatabase("featurebrawl")

    private val collectionName = "feature"

    override fun getAllFeatures(): List<Feature> {
        val col=database.getCollection<FeatureMongoRecord>(collectionName)
        return col.find().toList().map{ value -> value.toFeature() }
    }

    override fun getOneFeature(featureId: String): Feature {
        val col=database.getCollection<FeatureMongoRecord>(collectionName)
        val f= col.findOneById(featureId)
        return f?.toFeature()?:Feature()
    }

    override fun addFeature(feature: Feature): String {
        val col=database.getCollection<FeatureMongoRecord>(collectionName)
        var feat=FeatureMongoRecord(feature)
        col.insertOne(feat)
        return feat.id?:""
    }

    override fun vote(featureId: String, vote: Vote): Boolean {
        val col=database.getCollection<FeatureMongoRecord>(collectionName)
        val result=col.updateOneById(featureId,"{\$push : {\"votes\": {\"note\": ${vote.note} ,\"author\": \"${vote.author}\"} } }")
       if (result.modifiedCount>0)
           return true
        else
           return false
    }
}