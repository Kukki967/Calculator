import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.WindowSize
import androidx.compose.ui.window.WindowState
import androidx.compose.ui.window.application
import component.CalculatorMain

fun main() = application {
    //TODO : set window icon
    Window(
        title = "Compose Calculator",
        icon = painterResource("icon.png"),
        state = WindowState(size = WindowSize(400.dp, 450.dp)),
        resizable = false,
        undecorated = false,
        onCloseRequest = ::exitApplication
    ) {
        CalculatorMain()
    }
}
