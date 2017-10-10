package  com.saagie.tooling.featurebrawl.infra.adapters.primary

import com.patternity.annotation.designpattern.Adapter
import com.saagie.tooling.featurebrawl.domain.service.FeatureManagement
import com.saagie.tooling.featurebrawl.infra.adapters.primary.dto.FeatureAPI
import com.saagie.tooling.featurebrawl.infra.adapters.primary.dto.VoteAPI
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api")
@Adapter
class FeatureSpringRestController(@Autowired val featureManagement: FeatureManagement) {

    @GetMapping("feature")
    fun getAll():List<FeatureAPI> {
        return featureManagement.getAllFeatures().map { f -> FeatureAPI(f) }
    }

    @GetMapping("feature/{featureid}")
    fun get(@PathVariable featureid:String):FeatureAPI {
        return FeatureAPI(featureManagement.getOneFeature(featureid))
    }

    @PostMapping("feature")
    fun addFeature(@RequestBody feature:FeatureAPI):FeatureAPI {
        return FeatureAPI(featureManagement.addFeature(feature.toFeature()))
    }

    @PostMapping("feature/{featureid}/vote")
    fun addFeature(@RequestBody vote: VoteAPI, @PathVariable featureid:String):Boolean {
        return featureManagement.vote(featureid,vote.toVote())
    }

}