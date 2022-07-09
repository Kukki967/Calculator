package utils
import androidx.compose.material.lightColors
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.platform.Font
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

val CALCULATOR_PADDING = 4.dp

val lightThemeColors = lightColors(
    primary = Color(0xFFE96B6C),
    background = Color(0xF0F0F0),
    surface = Color(0xF5F5F5)
)

val jostFontFamily = FontFamily(listOf(Font("jost_regular.ttf", FontWeight.W100, FontStyle.Normal)))

val TitleAppBar by lazy {
    TextStyle(
        fontFamily = jostFontFamily,
        fontWeight = FontWeight.W900,
        fontSize = 16.sp,
        color = Firefly
    )
}

val TitleDisplayPanel by lazy {
    TextStyle(
        fontFamily = jostFontFamily,
        fontWeight = FontWeight.W900,
        fontSize = 48.sp,
//        color = Firefly
    )
}
val Title20 by lazy {
    TextStyle(
        fontFamily = jostFontFamily,
        fontWeight = FontWeight.W100,
        fontSize = 24.sp,
        color = Firefly
    )
}

val surface = Color(0xF5F5F5)
val bg = Color(0xF0F0F0)
val blue = Color(0xFF2376e6)
val Red300 = Color(0xFFD00036)
val Red800 = Color(0xFFEA6D7E)

val PurpleLight = Color(0xFFCFA0EB)
val Sunglo = Color(0xFFE96B6C)
val Bittersweet = Color(0xFFFF7475)
val MandysPink = Color(0xFFF5B9B4)

val Firefly = Color(0xFF0F2832)
val BlueBayoux = Color(0xFF4b6478)
val HalfBaked = Color(0xFF8EBAD2)

val SilverChalice = Color(0xFFA3A3A3)
val Mercury = Color(0xFFE7E7E7)
val Concrete = Color(0xFFF2F2F2)
val WildSand = Color(0xFFF4F4F4)

val Norway = Color(0xFF9CB793)
val TulipTree = Color(0xFFEBB942)
val Dallas = Color(0xFF78592B)
val Bubbles = Color (0xFF4bcd86)
val BlueButton = Color (0xFF9bcde6)
val BorderColor = Color(0xFFECECEC)
val Grey = Color(0xFFE6E6E6)
val PurPle = Color(0xFFC482E8)
val SemiTransparent = Color(0x66000000)
const val AlphaNearOpaque = 0.95f