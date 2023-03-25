package ne.futurinnov.abincitracker.data.local.entities

data class LocaliteFood(
    val id:Int,
    val latitude:Double,
    val longitude:Double,
    val pays:String,
    val region:String,
    val quartier:String,
    val enable:Boolean,
    val prixFoodPerLocalite:Double,
    val unite:String
)
