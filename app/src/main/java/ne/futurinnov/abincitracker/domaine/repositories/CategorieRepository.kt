package ne.futurinnov.abincitracker.domaine.repositories

import kotlinx.coroutines.flow.StateFlow
import ne.futurinnov.abincitracker.data.local.entities.Categorie
import ne.futurinnov.abincitracker.domaine.static.TypeCategorieRequest

interface CategorieRepository {
    fun getAllCategorie(typeCategorie: TypeCategorieRequest=TypeCategorieRequest.ALL):StateFlow<List<Categorie>>
    fun getCategorieById(id:Int):StateFlow<Categorie>
    fun getCategorie(name:String):StateFlow<Categorie>
    fun searchCategorie(keyword:String):StateFlow<List<Categorie>>
}