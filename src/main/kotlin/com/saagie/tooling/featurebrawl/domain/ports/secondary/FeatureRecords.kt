package com.saagie.tooling.featurebrawl.domain.ports.secondary

import com.patternity.annotation.ddd.stereotype.Port
import com.saagie.tooling.featurebrawl.model.Feature

@Port
interface FeatureRecords {

    fun getAllFeatures() : List<Feature>

    fun addFeature(feature: Feature) : String

}