package com.saagie.tooling.featurebrawl.infra.adapters.secondary

import com.mongodb.ServerAddress
import com.patternity.annotation.designpattern.Adapter
import com.saagie.tooling.featurebrawl.domain.ports.secondary.FeatureRecords
import com.saagie.tooling.featurebrawl.infra.adapters.secondary.dto.FeatureMongoRecord
import com.saagie.tooling.featurebrawl.model.Feature
import org.litote.kmongo.KMongo
import org.litote.kmongo.getCollection
import org.litote.kmongo.toList
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

    override fun getAllFeatures(): List<Feature> {
        val col=database.getCollection<FeatureMongoRecord>("feature")
        return col.find().toList().map{ value -> value.toFeature() }
    }

    override fun addFeature(feature: Feature): String {
        val col=database.getCollection<FeatureMongoRecord>()
        var feat=FeatureMongoRecord(feature)
        col.insertOne(feat)
        return feat.id?:""
    }
}