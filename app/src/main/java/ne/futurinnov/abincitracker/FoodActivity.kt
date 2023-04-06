package ne.futurinnov.abincitracker

import android.content.Context
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.ArrowBack
import androidx.compose.material.icons.outlined.Place
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import ne.futurinnov.abincitracker.data.local.entities.Food
import ne.futurinnov.abincitracker.data.local.entities.LocaliteFood
import ne.futurinnov.abincitracker.data.usecase.localites
import ne.futurinnov.abincitracker.ui.theme.AbinciTrackerTheme
import ne.futurinnov.abincitracker.ui.theme.BlueFoncee
import ne.futurinnov.abincitracker.ui.theme.GreenLight1

class FoodActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            window.statusBarColor= resources.getColor(R.color.blue_foncee)
            window.navigationBarColor=resources.getColor(R.color.blue_foncee)
            AbinciTrackerTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    val food=intent.getSerializableExtra("food") as Food
                    Scaffold(
                        topBar = { TopBarFood(food=food, context = this, onBack = { this.finish() }) }
                    ) {
                        FoodApp(food = food, context =this)
                    }

                }
            }
        }
    }
}

@Composable
fun FoodApp(food:Food, context: Context) {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Text(text = food.description, modifier = Modifier.padding(10.dp))
        Spacer(modifier = Modifier.height(10.dp))
        LazyColumn{
            items(localites){
               Box(Modifier.fillMaxWidth().padding(1.dp)) {
                   LocaliteCard(localite = it, context =context)
               }
            }
        }

    }
}

@Composable
fun LocaliteCard(localite:LocaliteFood, context: Context) {
    Row(
        modifier = Modifier
            .background(color = GreenLight1, shape = RoundedCornerShape(2.dp))
            .padding(5.dp)
            .fillMaxWidth()
    ) {
        Column(
            modifier = Modifier.weight(2f)
        ) {
            Text(text = "Quartier : ${localite.quartier}")
            Text(text = "Prix : ${localite.prixFoodPerLocalite} /${localite.unite} ")
        }
        IconButton(onClick = { Toast.makeText(context, "Desolé cette partie est en developpement", Toast.LENGTH_SHORT).show() }) {
            Icon(imageVector = Icons.Outlined.Place, contentDescription = null)
        }
    }

}
@Composable
fun TopBarFood(food: Food, context:Context, onBack:()->Unit) {

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

            }
        },
        actions={},
        title={ Text(text = food.libelle.toLowerCase())}
    )
}

