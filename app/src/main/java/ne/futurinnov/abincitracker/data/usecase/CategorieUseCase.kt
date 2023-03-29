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
val categorieUsecase = mutableListOf<Categorie>(
    Categorie(id = 1, name = "FRUITS ET LÉGUMES", enable = true, urlImage = "image", description = "Il est conseillé de manger au moins 5 portions de fruits et légumes par jour, en privilégiant les légumes."),
    Categorie(id = 2, name = "PRODUITS CÉRÉALIERS ET LÉGUMINEUSES", enable = true, urlImage = "image", description = "Les produits céréaliers (si possible complets) et les légumineuses, consommés tous les jours, participent à l'équilibre alimentaire."),
    Categorie(id = 3, name = "PRODUITS LAITIERS", enable = true, urlImage = "image", description = "Les produits laitiers sont riches en calcium et participent ainsi à la bonne santé des os. Il est conseillé d'en consommer 2 par jour."),
    Categorie(id = 4, name = "VIANDE, POISSON ET FRUITS DE MER", enable = true, urlImage = "image", description = "La viande, le poisson et les fruits de mer fournissent des protéines et du fer permettant au corps de bien fonctionner. Suivez les repères de consommation."),
    Categorie(id = 5, name = "MATIÈRES GRASSES", enable = true, urlImage = "image", description = "Certaines matières grasses peuvent causer des maladies cardiovasculaires. D’autres sont bénéfiques au fonctionnement du corps."),
    Categorie(id = 6, name = "PRODUITS SUCRÉS", enable = true, urlImage = "image", description = "Les aliments sucrés apportent de l’énergie sur une courte durée. Cependant, ils ont des effets néfastes sur la santé et sont à consommer avec modération."),
    Categorie(id = 7, name = "SEL", enable = true, urlImage = "image", description = "Trop de sel favorise les maladies cardiovasculaires. Il convient donc d’en réduire sa consommation."),
    Categorie(id = 8, name = "EAU", enable = true, urlImage = "image", description = "Élément essentiel de l’organisme, l’eau doit être consommée chaque jour à volonté, en l'absence d'une contre-indication médicale."),
    Categorie(id = 6, name = "EAU", enable = true, urlImage = "image", description = "Élément essentiel de l’organisme, l’eau doit être consommée chaque jour à volonté, en l'absence d'une contre-indication médicale."),
)
