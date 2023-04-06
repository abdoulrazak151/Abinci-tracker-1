package ne.futurinnov.abincitracker.presentation.components

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun StatistiqueContent() {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize()


    ) {
        Text(text = "Statistique")
    }
    
}

@Composable
fun RowScope.TableCell(
    text:String,
    weight:Float
) {
    Text(text = text,
        modifier = Modifier
            .border(1.dp, color= Color.Black)
            .weight(weight)
            .padding(8.dp)
    )

}
