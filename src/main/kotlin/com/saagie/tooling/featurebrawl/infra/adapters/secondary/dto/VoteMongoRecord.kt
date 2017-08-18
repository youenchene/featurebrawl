package com.saagie.tooling.featurebrawl.infra.adapters.secondary.dto

import com.saagie.tooling.featurebrawl.model.Vote

data class VoteMongoRecord(
        val note:Int=1,
        val author:String="anonymous") {

    constructor(vote: Vote) : this(vote.note,vote.author) {

    }

    fun toVote(): Vote {
        return Vote(note,author)
    }

}