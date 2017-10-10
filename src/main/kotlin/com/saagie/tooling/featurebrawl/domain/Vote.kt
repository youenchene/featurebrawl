package com.saagie.tooling.featurebrawl.domain

data class Vote(
        var note:Int=1,
        val author:String="anonymous") {

    fun getSecurizeVote():Vote {
        var secvote=this;
        if (this.note>1) { secvote.note=1 }
        if (this.note<-1) { secvote.note=-1 }
        return secvote;
    }
}
