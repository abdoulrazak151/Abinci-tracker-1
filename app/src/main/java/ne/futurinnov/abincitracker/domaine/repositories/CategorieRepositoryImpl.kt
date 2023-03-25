package ne.futurinnov.abincitracker.domaine.repositories

import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import ne.futurinnov.abincitracker.data.local.entities.Categorie
import ne.futurinnov.abincitracker.data.usecase.categorieUsecase
import ne.futurinnov.abincitracker.domaine.static.TypeCategorieRequest

class CategorieRepositoryImpl : CategorieRepository {
    val listCategorie=MutableStateFlow<List<Categorie>>(emptyList())
    override fun getAllCategorie(typeCategorie: TypeCategorieRequest): StateFlow<List<Categorie>> {
        listCategorie.value= categorieUsecase
        return listCategorie
    }

    override fun getCategorieById(id: Int): StateFlow<Categorie> {
        TODO("Not yet implemented")
    }

    override fun getCategorie(name: String): StateFlow<Categorie> {
        TODO("Not yet implemented")
    }

    override fun searchCategorie(keyword: String): StateFlow<List<Categorie>> {
        TODO("Not yet implemented")
    }
}