package ne.futurinnov.abincitracker.data.local.entities

data class Categorie(
    val id :Int,
    val name:String,
    val enable:Boolean,
    val urlImage:String,
    var foods:List<Food> = mutableListOf()
):java.io.Serializable
