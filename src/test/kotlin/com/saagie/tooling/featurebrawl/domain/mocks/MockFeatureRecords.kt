package com.saagie.tooling.featurebrawl.domain.mocks

import com.saagie.tooling.featurebrawl.domain.ports.secondary.FeatureRecords
import com.saagie.tooling.featurebrawl.domain.Feature
import com.saagie.tooling.featurebrawl.domain.Vote

class MockFeatureRecords:FeatureRecords {
    override fun addFeature(feature: Feature): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getAllFeatures(): List<Feature> {
        return listOf(Feature("1","A"),Feature("2","B"))
    }

    override fun getOneFeature(featureId: String): Feature {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun vote(featureId: String, vote: Vote): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}