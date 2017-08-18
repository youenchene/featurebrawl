package  com.saagie.tooling.featurebrawl.infra.adapters.primary

import com.patternity.annotation.designpattern.Adapter
import com.saagie.tooling.featurebrawl.domain.service.FeatureManagement
import com.saagie.tooling.featurebrawl.model.Feature
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api")
@Adapter
class FeatureSpringRestController(@Autowired val featureManagement: FeatureManagement) {

    @GetMapping("feature")
    fun getAll():List<Feature> {
        return featureManagement.getAllFeatures();
    }

    @PostMapping("feature")
    fun addFeature(@RequestBody feature:Feature):Feature {
        return featureManagement.addFeature(feature)
    }



}