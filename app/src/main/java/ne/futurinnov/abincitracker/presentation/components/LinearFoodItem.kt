package ne.futurinnov.abincitracker.presentation.components

import android.content.Context
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import ne.futurinnov.abincitracker.data.local.entities.Food

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
                Image(painter = painterResource(id = ne.futurinnov.abincitracker.R.drawable.mangue), contentDescription = )
            }

        }
    }
}