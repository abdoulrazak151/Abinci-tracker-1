package ne.futurinnov.abincitracker.presentation.components

import android.content.Context
import android.content.Intent
import android.widget.Space
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.GridCells

import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.content.ContextCompat.startActivity
import ne.futurinnov.abincitracker.AllCategorieActivity
import ne.futurinnov.abincitracker.MainActivity
import ne.futurinnov.abincitracker.data.local.entities.Categorie
import ne.futurinnov.abincitracker.data.usecase.foodUsecase
import ne.futurinnov.abincitracker.presentation.viewmodels.CategorieAndFoodViewmodel
import ne.futurinnov.abincitracker.ui.theme.BlueFoncee
import ne.futurinnov.abincitracker.ui.theme.Orange
import ne.futurinnov.abincitracker.ui.theme.WhiteDirty

@Composable
fun AccueilContent(
    categorieAndFoodViewmodel:CategorieAndFoodViewmodel,
    context:Context
) {
   Column(
       modifier = Modifier
           .fillMaxSize()
           .padding(10.dp)

   ) {
       CategorieScope(categorieAndFoodViewmodel.getListCategorie(),context)
       Spacer(modifier = Modifier.height(10.dp))
       FoodScope()
    
}

}

@Composable
fun CategorieScope(categories:List<Categorie>, context: Context) {
    Column(

    ) {
        Text(
            text ="Categorie",
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
            textAlign = TextAlign.Center,
            style = TextStyle(
                fontSize = 16.sp,
                fontWeight = FontWeight.SemiBold,
                color = BlueFoncee
            )
        )
        LazyRow(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.fillMaxWidth()
        ){
            items(categories.subList(0, 3)){
                CategoriItem(it, context=context)
            }
        }
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.End
        ){
            TextButton(onClick = { startActivity(context,Intent(context,AllCategorieActivity::class.java), null)}) {
                Text(
                    textAlign = TextAlign.Right,
                    text = "Voir tout",
                    style = TextStyle(
                        color= Orange,
                        fontWeight = FontWeight.Bold,
                        fontSize = 16.sp
                    )
                )
            }
        }
    }
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun FoodScope() {
    Column(

        modifier = Modifier
            .fillMaxSize()
            .padding(5.dp)
            .background(
                color = WhiteDirty,
                shape = RoundedCornerShape(topEnd = 10.dp, topStart = 10.dp)
            )

    ) {
        Text(
            text ="Les aliments les plus recherchés",
            style = TextStyle(
                color = BlueFoncee,
                fontSize = 16.sp,
                fontWeight = FontWeight.SemiBold
            ),
            textAlign = TextAlign.Center,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 5.dp, bottom = 5.dp)
        )
        LazyVerticalGrid(

            cells = GridCells.Adaptive(100.dp)){
            items(foodUsecase){
            FoodItem(it, Modifier.padding(5.dp))
            }
        }


    }
}