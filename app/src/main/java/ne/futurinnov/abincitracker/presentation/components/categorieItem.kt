package ne.futurinnov.abincitracker.presentation.components

import android.content.Context
import android.content.Intent
import android.graphics.drawable.shapes.Shape
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import ne.futurinnov.abincitracker.CategorieActivity
import ne.futurinnov.abincitracker.R
import ne.futurinnov.abincitracker.data.local.entities.Categorie
import ne.futurinnov.abincitracker.ui.theme.BlueFoncee
import ne.futurinnov.abincitracker.ui.theme.GreenDark
import ne.futurinnov.abincitracker.ui.theme.GreenLight
import ne.futurinnov.abincitracker.ui.theme.OrangeCard

@Composable
fun CategoriItem(
    categorie: Categorie,
    context:Context,
    modifier: Modifier=Modifier
        .width(100.dp)
        .height(100.dp)

) {
    Card(
        backgroundColor = GreenLight,
        modifier =modifier,
        shape = RoundedCornerShape(10.dp),
        border = BorderStroke(width = 0.dp, color = Color.White)
    ) {
        Column(
            modifier=Modifier
                .wrapContentSize(Alignment.Center)
                .clickable {
                    val intent=Intent(context.applicationContext,CategorieActivity::class.java )
                    intent.putExtra("categorie", categorie)
                    context.startActivity(intent)
                }
                ,
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Icon(modifier = Modifier.height(20.dp).width(20.dp),painter = painterResource(id = R.drawable.settings) , contentDescription = null, tint = BlueFoncee)
            Spacer(modifier = Modifier.height(5.dp))
            Text(
                text = categorie.name,
                fontSize=12.sp,
                color= BlueFoncee,
                textAlign = TextAlign.Center,
                modifier= Modifier
                    .fillMaxWidth()

            )
        }

    }
}