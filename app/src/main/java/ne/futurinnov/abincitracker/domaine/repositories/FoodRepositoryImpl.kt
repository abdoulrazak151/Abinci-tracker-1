package ne.futurinnov.abincitracker.domaine.repositories

import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import ne.futurinnov.abincitracker.data.local.entities.Food
import ne.futurinnov.abincitracker.data.usecase.foodUsecase
import ne.futurinnov.abincitracker.domaine.static.TypeFoodRequest

class FoodRepositoryImpl : FoodRepository {
    val listFood = MutableStateFlow<List<Food>>(emptyList())
    override fun getAllFood(typeFood: TypeFoodRequest): StateFlow<List<Food>> {
        listFood.value= foodUsecase
        return listFood
    }

    override fun getFoodById(id: Int): StateFlow<Food> {
        TODO("Not yet implemented")
    }

    override fun searchFood(keyword: String): StateFlow<List<Food>> {
        TODO("Not yet implemented")
    }
}