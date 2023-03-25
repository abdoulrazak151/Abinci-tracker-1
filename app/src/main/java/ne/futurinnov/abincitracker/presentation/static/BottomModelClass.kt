package ne.futurinnov.abincitracker.presentation.static

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class BottomModelClass(
    @DrawableRes val iconPainter:Int,
    val name:String,
    var description:String=name,
    val screen:Screen,
    var isClick:Boolean=false
)
