package com.saagie.tooling.featurebrawl.domain.service

import com.patternity.annotation.ddd.stereotype.DomainService
import com.saagie.tooling.featurebrawl.domain.ports.secondary.FeatureRecords
import com.saagie.tooling.featurebrawl.domain.Feature
import com.saagie.tooling.featurebrawl.domain.Vote

@DomainService
open class FeatureManagement(val featureRecords: FeatureRecords) {

    fun getAllFeatures() : List<Feature> {
        return featureRecords.getAllFeatures()
    }

    fun getOneFeature(featureId: String) : Feature {
        return featureRecords.getOneFeature(featureId)
    }

    fun addFeature(feature:Feature) : Feature {
        val id = featureRecords.addFeature(feature)
        var feat=feature.copy(id)
        return feat
    }

    fun vote(featureId:String,vote: Vote):Boolean {
        return featureRecords.vote(featureId,vote.getSecurizeVote())
    }
}