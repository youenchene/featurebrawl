package com.saagie.tooling.featurebrawl.infra.adapters.primary

import com.patternity.annotation.designpattern.Adapter
import com.saagie.tooling.featurebrawl.domain.ports.secondary.FeatureRecords
import com.saagie.tooling.featurebrawl.domain.service.FeatureManagement
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

/*
* Handler to see Domain Service a Spring Service.
*
* */
@Service
@Adapter
class FeatureManagementSpringHandler(@Autowired featureRecords: FeatureRecords): FeatureManagement(featureRecords) {

}