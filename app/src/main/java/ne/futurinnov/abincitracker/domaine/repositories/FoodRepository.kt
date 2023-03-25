package ne.futurinnov.abincitracker.domaine.repositories

import kotlinx.coroutines.flow.StateFlow
import ne.futurinnov.abincitracker.data.local.entities.Food
import ne.futurinnov.abincitracker.domaine.static.TypeFoodRequest

interface FoodRepository {
    fun getAllFood(typeFood:TypeFoodRequest):StateFlow<List<Food>>
    fun getFoodById(id:Int):StateFlow<Food>
    fun searchFood(keyword:String):StateFlow<List<Food>>
}