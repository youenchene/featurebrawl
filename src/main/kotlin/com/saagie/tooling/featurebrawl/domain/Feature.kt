package  com.saagie.tooling.featurebrawl.model

data class Feature(val id: String ="",
                   val name: String ="New Feature",
                   val description:String ="",
                   val votes:List<Vote> = emptyList(),
                   val themes:List<String> = emptyList(),
                   val customers:List<String> = emptyList(),
                   val score:Int = votes.fold(0) { sum:Int, element -> element.note + sum}) {


    fun vote(featureId:String,vote:Int):Boolean {
        //
        return false
    }

}
