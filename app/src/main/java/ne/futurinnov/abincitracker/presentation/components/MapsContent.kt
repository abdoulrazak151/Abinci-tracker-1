package ne.futurinnov.abincitracker.presentation.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Switch
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.google.maps.android.compose.GoogleMap
import com.google.maps.android.compose.MapProperties
import com.google.maps.android.compose.MapType
import com.google.maps.android.compose.MapUiSettings

@Composable
fun MapsContent() {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize()


    ) {
        var uiSettings by remember { mutableStateOf(MapUiSettings()) }
        var properties by remember {
            mutableStateOf(MapProperties(mapType = MapType.SATELLITE))
        }

        Box(Modifier.fillMaxSize()) {
            GoogleMap(
                modifier = Modifier.matchParentSize(),
                properties = properties,
                uiSettings = uiSettings
            )
            Switch(
                checked = uiSettings.zoomControlsEnabled,
                onCheckedChange = {
                    uiSettings = uiSettings.copy(zoomControlsEnabled = it)
                }
            )
        }
    }
    
}