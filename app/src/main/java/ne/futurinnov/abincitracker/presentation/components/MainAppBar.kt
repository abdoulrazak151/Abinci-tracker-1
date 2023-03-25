package ne.futurinnov.abincitracker.presentation.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.outlined.Menu
import androidx.compose.material.icons.outlined.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import ne.futurinnov.abincitracker.ui.theme.BlueFoncee

@Composable
fun MainAppBar() {

    TopAppBar(

        backgroundColor = BlueFoncee,
        contentColor = Color.White,
        contentPadding = PaddingValues(5.dp)

    ) {
        IconButton(onClick = { /*TODO*/ }) {
            Icon(imageVector = Icons.Outlined.Menu, contentDescription ="Menu" )
        }

        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.fillMaxWidth()
        ){
            Text("Abinci Tracker")
            IconButton(

                onClick = { /*TODO*/ }) {
                Icon(imageVector = Icons.Outlined.Search, contentDescription ="recherche" )
            }
        }


    }
    
}