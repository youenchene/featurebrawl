package com.saagie.tooling.featurebrawl.domain

import com.saagie.tooling.featurebrawl.model.Vote
import com.saagie.tooling.featurebrawl.model.Feature
import org.junit.Test
import kotlin.test.assertEquals

class FeaturebrawlModelTests {

	@Test
	fun should_score_correctly_a_list_of_votes() {
		//Given
		val votes=listOf(Vote(note = 1),Vote(note = -1),Vote(note = 1),Vote(note = 1))
		val feature= Feature(votes= votes)
		//When
		val score=feature.score
		//Then
		assertEquals(2,score)
	}

}
