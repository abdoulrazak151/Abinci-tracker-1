package ne.futurinnov.abincitracker.presentation.viewmodels

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import ne.futurinnov.abincitracker.data.local.entities.Categorie
import ne.futurinnov.abincitracker.data.local.entities.Food

import ne.futurinnov.abincitracker.domaine.repositories.CategorieRepositoryImpl
import ne.futurinnov.abincitracker.domaine.repositories.FoodRepositoryImpl
import ne.futurinnov.abincitracker.domaine.static.TypeCategorieRequest
import ne.futurinnov.abincitracker.domaine.static.TypeFoodRequest

class CategorieAndFoodViewmodel: ViewModel() {
    private val categorieRepository=CategorieRepositoryImpl()
    private val foodRepository=FoodRepositoryImpl()
    private val _listCategorie = MutableStateFlow<List<Categorie>>(emptyList())
    var listCategorie : StateFlow<List<Categorie>> = _listCategorie
    private val _listFood = MutableStateFlow<List<Food>>(emptyList())
    var listFood:StateFlow<List<Food>> = _listFood
    fun getListCategorie():List<Categorie>{
        listCategorie=categorieRepository.getAllCategorie(TypeCategorieRequest.ALL)
        return listCategorie.value
    }
    fun getListFood():List<Food>{
        listFood=foodRepository.getAllFood(TypeFoodRequest.ALL)
        return listFood.value
    }
}