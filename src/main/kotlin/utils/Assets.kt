@file:Suppress("SameParameterValue")

package utils

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathParser
import androidx.compose.ui.unit.dp

object Assets {
    val OutlineBackspace = vectorBuilder().addPath(
        pathData = parsePath("M22,3L7,3c-0.69,0 -1.23,0.35 -1.59,0.88L0,12l5.41,8.11c0.36,0.53 0.9,0.89 1.59,0.89h15c1.1,0 2,-0.9 2,-2L24,5c0,-1.1 -0.9,-2 -2,-2zM22,19L7.07,19L2.4,12l4.66,-7L22,5v14zM10.41,17L14,13.41 17.59,17 19,15.59 15.41,12 19,8.41 17.59,7 14,10.59 10.41,7 9,8.41 12.59,12 9,15.59z"),
        fill = SolidColor(Color.White)
    ).build()

}

private fun vectorBuilder() = ImageVector.Builder(
    defaultWidth = 24.dp,
    defaultHeight = 24.dp,
    viewportWidth = 24f,
    viewportHeight = 24f
)

private fun parsePath(pathStr: String) = PathParser().parsePathString(pathStr).toNodes()


enum class KeyPadLabel {
    ONE,
    TWO,
    THREE,
    FOUR,
    FIVE,
    SIX,
    SEVEN,
    EIGHT,
    NINE,
    ZERO,
    CLEAR,
    CUT,
    DOUBLE_ZERO,
    PLUS,
    MINUS,
    DIV,
    PRODUCT,
    PERCENT,
    EQUALS,
    DEC;

    fun labelToNum(): String {
        return when (this) {
            ONE -> "1"
            TWO -> "2"
            THREE -> "3"
            FOUR -> "4"
            FIVE -> "5"
            SIX -> "6"
            SEVEN -> "7"
            EIGHT -> "8"
            NINE -> "9"
            ZERO -> "0"
            PLUS -> "+"
            MINUS -> "-"
            PRODUCT -> "x"
            PERCENT -> "%"
            EQUALS -> "="
            DIV -> "÷"
            CLEAR -> "AC"
            DEC -> "."
            DOUBLE_ZERO -> "00"
            else -> ""
        }
    }
} // end utils.KeyPadLabel
