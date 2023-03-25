package ne.futurinnov.abincitracker.presentation.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Home
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import ne.futurinnov.abincitracker.presentation.static.BottomModelClass
import ne.futurinnov.abincitracker.presentation.static.Screen
import ne.futurinnov.abincitracker.ui.theme.BlueFoncee
import ne.futurinnov.abincitracker.ui.theme.Orange

@Composable
fun MainBottomBar(
    navController: NavHostController,
    items:List<BottomModelClass>
) {
    BottomNavigation(
        backgroundColor = BlueFoncee,
        contentColor = Color.White
    ) {
        var isClick by remember{mutableStateOf(false)}
        items.forEach { 
            BottomNavigationItem(selected = isClick, onClick = {
                isClick=true
               navController.navigate(route = it.screen.toString())
            },  icon = {
                Icon(
                    modifier=Modifier
                        .size(20.dp),
                    painter = painterResource(id = it.iconPainter),
                    contentDescription =it.description
                )
            },

            )
        }
        
    }
}