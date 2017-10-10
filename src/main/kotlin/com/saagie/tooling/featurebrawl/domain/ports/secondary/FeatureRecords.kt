package com.saagie.tooling.featurebrawl.domain.ports.secondary

import com.patternity.annotation.ddd.stereotype.Port
import com.saagie.tooling.featurebrawl.domain.Feature
import com.saagie.tooling.featurebrawl.domain.Vote

@Port
interface FeatureRecords {

    fun getAllFeatures() : List<Feature>

    fun getOneFeature(featureId: String) : Feature

    fun addFeature(feature: Feature) : String

    fun vote(featureId:String,vote: Vote) : Boolean

}