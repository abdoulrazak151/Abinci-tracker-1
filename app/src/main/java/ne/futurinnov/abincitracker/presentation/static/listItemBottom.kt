package ne.futurinnov.abincitracker.presentation.static

import ne.futurinnov.abincitracker.R

val listBottomItems= listOf<BottomModelClass>(
    BottomModelClass(
        iconPainter = R.drawable.home,
        name = "Accueil",
        screen = Screen.accueil
    ),
    BottomModelClass(
        iconPainter = R.drawable.map,
        name = "maps",
        screen = Screen.map
    ),
    BottomModelClass(
        iconPainter = R.drawable.statistic,
        name = "Statistique",
        screen = Screen.marketPlace
    ),
    BottomModelClass(
        iconPainter = R.drawable.settings,
        name = "Paramètre",
        screen = Screen.parametre
    )
)