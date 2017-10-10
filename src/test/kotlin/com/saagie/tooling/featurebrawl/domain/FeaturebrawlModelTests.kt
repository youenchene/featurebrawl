package com.saagie.tooling.featurebrawl.domain

import com.saagie.tooling.featurebrawl.domain.Vote
import com.saagie.tooling.featurebrawl.domain.Feature
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

	@Test
	fun should_not_cheat_like_french_politics() {
		//Given
		val vote=Vote(10)
		//When
		val secvote=vote.getSecurizeVote()
		//Then
		assertEquals(1,secvote.note)
	}

    @Test
    fun should_not_cheat_by_minus() {
        //Given
        val vote=Vote(-2)
        //When
        val secvote=vote.getSecurizeVote()
        //Then
        assertEquals(-1,secvote.note)
    }

}
