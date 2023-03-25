package ne.futurinnov.abincitracker.data.local.entities

import java.util.Date

data class Food(
    val id:Int,
    val  libelle :String,
    val description:String,
    val date:Date,
    var nutriments:List<NutrimentFood> = mutableListOf(),
    var localites:List<LocaliteFood> = mutableListOf()
    )
