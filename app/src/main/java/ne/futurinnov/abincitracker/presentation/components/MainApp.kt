package ne.futurinnov.abincitracker.presentation.components

import android.content.Context
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable


import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable


import androidx.navigation.compose.rememberNavController
import ne.futurinnov.abincitracker.presentation.static.Screen
import ne.futurinnov.abincitracker.presentation.static.listBottomItems
import ne.futurinnov.abincitracker.presentation.viewmodels.CategorieAndFoodViewmodel

@Composable
fun MainApp(
    modifier: Modifier=Modifier,
    categorieAndFoodViewmodel:CategorieAndFoodViewmodel,
    context:Context
) {
    val navigationController= rememberNavController()

    Scaffold(
        modifier = modifier,
        topBar = { MainAppBar()},
        bottomBar = { MainBottomBar(navController = navigationController, items = listBottomItems )}
    ) {
        NavHost(
            navController = navigationController,
            startDestination =Screen.accueil.toString(),
            modifier=Modifier.padding(5.dp)
        ){
            composable(route=Screen.accueil.toString()){
                AccueilContent(categorieAndFoodViewmodel, context = context)
            }
            composable(route = Screen.map.toString()){
                MapsContent()
            }
            composable(route=Screen.marketPlace.toString()){
                StatistiqueContent()
            }
            composable(route=Screen.parametre.toString()){
                SettingContent()
            }

        }
        
    }    
}