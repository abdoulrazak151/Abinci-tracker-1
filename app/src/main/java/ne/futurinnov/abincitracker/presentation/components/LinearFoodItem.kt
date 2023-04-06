package ne.futurinnov.abincitracker.presentation.components

import android.content.Context
import android.content.Intent
import android.widget.Space
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.ArrowBack
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.toLowerCase
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import ne.futurinnov.abincitracker.FoodActivity
import ne.futurinnov.abincitracker.data.local.entities.Categorie
import ne.futurinnov.abincitracker.data.local.entities.Food
import ne.futurinnov.abincitracker.ui.theme.BlueFoncee
import ne.futurinnov.abincitracker.ui.theme.GreenDark
import ne.futurinnov.abincitracker.ui.theme.Orange

@Composable
fun LinearFoodItem(food:Food, context: Context, onClick:(Food)->Unit) {
    Card(
        modifier = Modifier
            .clickable{
                val intent=Intent(context, FoodActivity::class.java)
                food.localites= listOf()
                intent.putExtra("food", food)
                context.startActivity(intent)
            }
            .padding(top = 5.dp),
        shape = RoundedCornerShape(10.dp)
    ) {
        Row(
            modifier=Modifier.fillMaxWidth()

        ) {
            Box(modifier = Modifier.size(height = 100.dp, width = 100.dp)){
                Image(painter = painterResource(id = ne.futurinnov.abincitracker.R.drawable.mangue), contentDescription =food.libelle )
            }
            Spacer(modifier = Modifier.width(10.dp))
            Column(

            ) {
                Text(text = food.libelle, fontSize = 16.sp, fontWeight = FontWeight.SemiBold)
                Row(){
                    Icon(modifier = Modifier.height(12.dp), painter = painterResource(id = ne.futurinnov.abincitracker.R.drawable.money), contentDescription = null, tint = GreenDark)
                    Text(text = "${food.localites[0].prixFoodPerLocalite} / ${food.localites[0].unite}", color = Orange, fontWeight = FontWeight.Light, fontSize = 12.sp)
                }
            }

        }
    }
}
