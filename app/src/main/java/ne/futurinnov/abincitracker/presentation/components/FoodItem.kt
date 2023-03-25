package ne.futurinnov.abincitracker.presentation.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import ne.futurinnov.abincitracker.R
import ne.futurinnov.abincitracker.data.local.entities.Food
import ne.futurinnov.abincitracker.ui.theme.BlueFoncee
import ne.futurinnov.abincitracker.ui.theme.GreenDark
import ne.futurinnov.abincitracker.ui.theme.Orange

@Composable
fun FoodItem(foodLFood: Food, modifier:Modifier=Modifier) {
    Card (
        backgroundColor = Color.White,
        modifier =modifier
            ){
      Column(
          horizontalAlignment = Alignment.CenterHorizontally,
          verticalArrangement = Arrangement.Center
      ) {
          Image(
              modifier= Modifier
                  .height(100.dp)
                  .width(100.dp),
              painter = painterResource(id = R.drawable.mangue),
              contentDescription =null)
          Spacer(modifier = Modifier.height(5.dp))

          Text(
              modifier = Modifier
                  .fillMaxWidth()
                  .padding(horizontal = 3.dp),
              text =foodLFood.libelle,
              textAlign = TextAlign.Center,
              style = TextStyle(
                  color = GreenDark,
                  fontWeight = FontWeight.Light,
                  fontSize = 16.sp
              )
          )
          Spacer(modifier = Modifier.height(5.dp))
          Row(

              horizontalArrangement = Arrangement.SpaceBetween,
              verticalAlignment = Alignment.CenterVertically,
              modifier = Modifier.padding(horizontal = 2.dp)
          ) {
              Text(
                  text = "${foodLFood.localites[0].prixFoodPerLocalite} / Kg",
                  style = TextStyle(
                      color= BlueFoncee,
                      fontWeight = FontWeight.SemiBold,
                      fontSize = 10.sp
                  )
              )
              IconButton(onClick = { /*TODO*/ }) {
                  Icon(
                      modifier= Modifier
                          .height(10.dp)
                          .width(10.dp),
                      painter = painterResource(id = R.drawable.map),
                      contentDescription = null,
                      tint = Orange,

                      )
              }
          }

      }
    }
}