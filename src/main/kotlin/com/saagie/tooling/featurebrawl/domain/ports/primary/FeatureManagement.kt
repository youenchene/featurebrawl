package com.saagie.tooling.featurebrawl.domain.service

import com.patternity.annotation.ddd.stereotype.DomainService
import com.saagie.tooling.featurebrawl.domain.ports.secondary.FeatureRecords
import com.saagie.tooling.featurebrawl.model.Feature

@DomainService
open class FeatureManagement(val featureRecords: FeatureRecords) {

    fun getAllFeatures() : List<Feature> {
        return featureRecords.getAllFeatures()
    }

    fun addFeature(feature:Feature) : Feature {
        val id = featureRecords.addFeature(feature)
        var feat=feature.copy(id)
        return feature
    }

    fun vote(featureId:String,vote:Int):Boolean {
        //
        return false
    }
}