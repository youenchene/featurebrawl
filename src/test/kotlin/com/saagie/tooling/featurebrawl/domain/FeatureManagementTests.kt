package com.saagie.tooling.featurebrawl.domain

import com.saagie.tooling.featurebrawl.domain.mocks.MockFeatureRecords
import com.saagie.tooling.featurebrawl.domain.service.FeatureManagement
import org.junit.Test
import kotlin.test.assertEquals

class FeatureManagementTests {

    @Test
    fun should_get_all_features() {
        //Given
        val featureManagement:FeatureManagement= FeatureManagement(MockFeatureRecords())
        //When
        val result=featureManagement.getAllFeatures();
        //Then
        assertEquals(2,result.size)
        assertEquals("A",result[0].name)
        assertEquals("B",result[1].name)
    }
}