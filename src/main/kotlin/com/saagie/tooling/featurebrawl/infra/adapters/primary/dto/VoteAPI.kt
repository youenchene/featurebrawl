package com.saagie.tooling.featurebrawl.infra.adapters.primary.dto

import com.saagie.tooling.featurebrawl.domain.Vote

data class VoteAPI(
        val note:Int=1,
        val author:String="anonymous") {

    constructor(vote: Vote) : this(vote.note,vote.author) {

    }

    fun toVote(): Vote {
        return Vote(note,author)
    }

}