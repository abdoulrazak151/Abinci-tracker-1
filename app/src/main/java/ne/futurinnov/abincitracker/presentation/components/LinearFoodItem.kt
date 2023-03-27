package ne.futurinnov.abincitracker.presentation.components

import android.content.Context
import android.widget.Space
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import ne.futurinnov.abincitracker.data.local.entities.Food
import ne.futurinnov.abincitracker.ui.theme.GreenDark
import ne.futurinnov.abincitracker.ui.theme.Orange

@Composable
fun LinearFoodItem(food:Food, context: Context) {
    Card(
        modifier = Modifier
            .padding(10.dp),
        shape = RoundedCornerShape(10.dp)
    ) {
        Row(

        ) {
            Box(modifier = Modifier.size(height = 150.dp, width = 150.dp)){
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