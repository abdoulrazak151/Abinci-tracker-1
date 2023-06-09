package ne.futurinnov.abincitracker

import android.content.Context
import android.os.Bundle
import android.widget.Space
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.ArrowBack
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import ne.futurinnov.abincitracker.data.local.entities.Categorie
import ne.futurinnov.abincitracker.data.usecase.foodUsecase
import ne.futurinnov.abincitracker.presentation.components.FoodItem
import ne.futurinnov.abincitracker.presentation.components.LinearFoodItem
import ne.futurinnov.abincitracker.ui.theme.*

class CategorieActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            window.statusBarColor= resources.getColor(R.color.blue_foncee)
            window.navigationBarColor=resources.getColor(R.color.blue_foncee)
            AbinciTrackerTheme {
                // A surface container using the 'background' color from the theme
                val categorie=intent.getSerializableExtra("categorie") as Categorie
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Scaffold(
                        topBar = { TopBar(categorie = categorie, context = this@CategorieActivity, onBack = { onBack() })}
                    ) {
                        Body(categorie = categorie,context =this@CategorieActivity )
                    }
                }
            }
        }
    }
    private fun onBack(){
        CategorieActivity@this.finish()
    }
}

@Composable
fun TopBar(categorie:Categorie, context:Context, onBack:()->Unit) {

    TopAppBar(
        backgroundColor = BlueFoncee,
        contentColor = Color.White,
        navigationIcon = {
                         Row(){
                            IconButton(
                                onClick = {onBack()}
                            ){
                                Icon(imageVector =Icons.Outlined.ArrowBack , contentDescription ="retour en arrière" )
                            }
                             Spacer(modifier = Modifier.height(2.dp))
                             Image(imageVector = Icons.Outlined.Settings, contentDescription = null)
                         }
        },
        actions={},
        title={ Text(text = categorie.name.lowercase())}
    )
}

@Composable
fun Body(categorie: Categorie, context: Context) {
    Column(
        modifier = Modifier
            .padding(10.dp)
    ) {
        Card(
            shape = RoundedCornerShape(10.dp),
            modifier = Modifier.fillMaxWidth(),
            backgroundColor = GreenLight1,
            border = BorderStroke(width = 0.dp, color = GreenLight1)

        ) {
           Text(
               modifier=Modifier
                   .padding(10.dp)
                   .background(color = Color.Transparent)
               ,
               text=categorie.description,
               fontWeight = FontWeight.Light,
               color= GreenDark
           )
        }
        Spacer(modifier = Modifier.height(10.dp))
        LazyColumn(modifier = Modifier.padding(10.dp)){
            items(foodUsecase + foodUsecase){
                LinearFoodItem(food = it, context =context, onClick = {})
            }
        }
    }
}


