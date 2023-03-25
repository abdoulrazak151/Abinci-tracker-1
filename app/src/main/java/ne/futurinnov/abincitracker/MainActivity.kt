package ne.futurinnov.abincitracker

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import ne.futurinnov.abincitracker.presentation.components.MainApp
import ne.futurinnov.abincitracker.presentation.viewmodels.CategorieAndFoodViewmodel
import ne.futurinnov.abincitracker.ui.theme.AbinciTrackerTheme
import ne.futurinnov.abincitracker.ui.theme.BlueFoncee
import java.util.jar.Manifest

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            window.statusBarColor= resources.getColor(R.color.blue_foncee)
            window.navigationBarColor=resources.getColor(R.color.blue_foncee)
            val categorieAndFoodViewmodel by viewModels<CategorieAndFoodViewmodel>()


            AbinciTrackerTheme {
                MainApp(categorieAndFoodViewmodel=categorieAndFoodViewmodel, context = this)
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    AbinciTrackerTheme {
        Greeting("Android")
    }
}