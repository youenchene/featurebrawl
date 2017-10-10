package com.saagie.tooling.featurebrawl.infra.adapters.primary.dto

import com.saagie.tooling.featurebrawl.domain.Feature


data class FeatureAPI(val id: String?,
                      val name: String ="",
                      val description:String ="",
                      val votes:List<VoteAPI> = emptyList(),
                      val themes:List<String> = emptyList(),
                      val customers:List<String> = emptyList(),
                      val score:Int = 0) {

    constructor(feature: Feature) : this(if (feature.id=="") null else feature.id, feature.name, feature.description, feature.votes.map{ value -> VoteAPI(value) }, feature.themes, feature.customers, feature.score) {

    }

    fun toFeature():Feature {
        return Feature(id?:"",name,description,votes.map { v -> v.toVote() },themes,customers)
    }

}
