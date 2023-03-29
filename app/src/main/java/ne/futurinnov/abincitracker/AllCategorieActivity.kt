package ne.futurinnov.abincitracker

import android.content.Context
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import ne.futurinnov.abincitracker.presentation.components.CategoriItem
import ne.futurinnov.abincitracker.presentation.viewmodels.CategorieAndFoodViewmodel
import ne.futurinnov.abincitracker.ui.theme.AbinciTrackerTheme
import ne.futurinnov.abincitracker.ui.theme.BlueFoncee

class AllCategorieActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val categorieAndFoodViewmodel by viewModels<CategorieAndFoodViewmodel>()
            window.statusBarColor= resources.getColor(R.color.blue_foncee)
            window.navigationBarColor=resources.getColor(R.color.blue_foncee)
            AbinciTrackerTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Scaffold(
                        topBar = { TopBar(
                            filterFunction = {onFilter()},
                            backFunction = {onBack()}
                        )}
                    ) {
                        Column(
                            modifier = Modifier.padding(10.dp)
                        ) {
                            Body(categorieAndFoodViewmodel = categorieAndFoodViewmodel, context = this@AllCategorieActivity)
                        }
                    }
                }
            }
        }
    }
    private  fun onBack(){
        AllCategorieActivity@this.finish()
    }
    private fun onFilter(){

    }
}

@Composable
fun TopBar(
    filterFunction:()->Unit,
    backFunction:()->Unit
) {
    TopAppBar (
        backgroundColor = BlueFoncee,
        contentColor = Color.White,
       navigationIcon = { IconButton(onClick = { backFunction() }) {
           Icon(imageVector = Icons.Outlined.ArrowBack, contentDescription = "retourner au menu")
       }},
        actions = {
                  Row() {
                      IconButton(onClick = {filterFunction() }) {
                          Icon(
                              modifier= Modifier
                                  .width(20.dp)
                                  .height(20.dp)
                              ,
                              painter = painterResource(id = R.drawable.filter), contentDescription = "Filtre")
                      }
                  }
        },
        title = {Text("Categories")}

            )

}

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun Body(
    context:Context,
    categorieAndFoodViewmodel: CategorieAndFoodViewmodel
) {
    LazyVerticalGrid(
        horizontalArrangement = Arrangement.Center,
        cells = GridCells.Fixed(3)){
        items(categorieAndFoodViewmodel.getListCategorie()){
            Box(modifier = Modifier.padding(10.dp)) {
                CategoriItem(categorie = it, context = context)
            }
        }
    }
}
