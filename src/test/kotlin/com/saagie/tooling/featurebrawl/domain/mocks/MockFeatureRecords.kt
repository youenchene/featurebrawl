package com.saagie.tooling.featurebrawl.domain.mocks

import com.saagie.tooling.featurebrawl.domain.ports.secondary.FeatureRecords
import com.saagie.tooling.featurebrawl.model.Feature

class MockFeatureRecords:FeatureRecords {
    override fun addFeature(feature: Feature): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getAllFeatures(): List<Feature> {
        return listOf(Feature("1","A"),Feature("2","B"))
    }

}