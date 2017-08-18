package com.saagie.tooling.featurebrawl.infra.adapters.secondary.dto

import com.saagie.tooling.featurebrawl.model.Feature
import com.saagie.tooling.featurebrawl.model.Vote
import org.bson.types.ObjectId
import org.litote.kmongo.MongoId

data class FeatureMongoRecord(@MongoId val id: String?,
                              val name: String ="",
                              val description:String ="",
                              val votes:List<VoteMongoRecord> = emptyList(),
                              val themes:List<String> = emptyList(),
                              val customers:List<String> = emptyList(),
                              val score:Int = 0) {

    constructor(feature: Feature) : this(if (feature.id=="") null else feature.id, feature.name, feature.description, feature.votes.map{ value -> VoteMongoRecord(value) }, feature.themes, feature.customers, feature.score) {

    }

    fun toFeature():Feature {
        return Feature(id?:"",name,description,votes.map { v -> v.toVote() },themes,customers)
    }

}
