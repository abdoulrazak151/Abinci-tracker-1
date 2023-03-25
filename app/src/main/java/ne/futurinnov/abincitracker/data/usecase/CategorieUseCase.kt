package ne.futurinnov.abincitracker.data.usecase

import ne.futurinnov.abincitracker.data.local.entities.Categorie
import ne.futurinnov.abincitracker.data.local.entities.Food
import ne.futurinnov.abincitracker.data.local.entities.LocaliteFood
import java.time.LocalDate
import java.util.*
val localites= listOf(
    LocaliteFood(id = 1, latitude = 12.23, longitude = 123.56, pays = "Niger", region = "Niamey", "Plateau", prixFoodPerLocalite = 2000.0, unite = "kg", enable = true),
    LocaliteFood(id = 2, latitude = 124.23, longitude = 123.56, pays = "Niger", region = "Niamey", "Plateau", prixFoodPerLocalite = 2000.0, unite = "kg", enable = true),
    LocaliteFood(id = 3, latitude = 125.3, longitude = 123.56, pays = "Niger", region = "Niamey", "Plateau", prixFoodPerLocalite = 2000.0, unite = "kg", enable = true),
    LocaliteFood(id = 4, latitude = 12.20, longitude = 1.56, pays = "Niger", region = "Niamey", "Plateau", prixFoodPerLocalite = 2000.0, unite = "kg", enable = true),
    LocaliteFood(id = 5, latitude = 12.23, longitude = 13.56, pays = "Niger", region = "Niamey", "Plateau", prixFoodPerLocalite = 2000.0, unite = "kg", enable = true),
    LocaliteFood(id = 6, latitude = 12.23, longitude = 123.56, pays = "Niger", region = "Niamey", "Plateau", prixFoodPerLocalite = 2000.0, unite = "kg", enable = true),
    LocaliteFood(id = 7, latitude = 12.23, longitude = 123.56, pays = "Niger", region = "Niamey", "Plateau", prixFoodPerLocalite = 2000.0, unite = "kg", enable = true),
    LocaliteFood(id = 8, latitude = 12.23, longitude = 123.56, pays = "Niger", region = "Niamey", "Plateau", prixFoodPerLocalite = 2000.0, unite = "kg", enable = true),
)

val categorieUsecase = mutableListOf<Categorie>(
    Categorie(id = 1, name = "Fruit", enable = true, urlImage = "image"),
    Categorie(id = 2, name = "Legume", enable = true, urlImage = "image"),
    Categorie(id = 3, name = "Fast Food", enable = true, urlImage = "image"),
    Categorie(id = 4, name = "Farine", enable = true, urlImage = "image"),
    Categorie(id = 5, name = "Consommable", enable = true, urlImage = "image"),
    Categorie(id = 6, name = "Boisson", enable = true, urlImage = "image"),
)
val foodUsecase = mutableListOf(
    Food(
        id = 1,
        libelle = "Mangue",
        description = "Mangue",
        date = Date(),
        localites = localites

    ),
    Food(
        id = 2,
        libelle = "Jus de gingimbre",
        description = "Jus de gingimbre",
        date = Date(),
        localites = localites
    ),
    Food(
        id = 3,
        libelle = "Oignon",
        description = "Oignon",
        date = Date(),
        localites = localites
    ),
    Food(
        id = 4,
        libelle = "Mangue",
        description = "Ail",
        date = Date(),
        localites = localites
    ),
    Food(
        id = 5,
        libelle = "Orange",
        description = "Orange",
        date = Date(),
        localites = localites
    )
)
