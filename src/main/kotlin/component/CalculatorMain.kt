package component

import DisplayPanel
import KeyPadView
import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.TextFieldValue
import service.keyListener
import utils.lightThemeColors


@Composable
@Preview
fun CalculatorMain() {
    MaterialTheme(colors = lightThemeColors) {
        val mainOutput = remember { mutableStateOf(TextFieldValue("0")) }

        Column(Modifier.fillMaxHeight()) {
            DisplayPanel(modifier = Modifier.weight(1f), mainOutput = mainOutput)
            KeyPadView(modifier = Modifier.weight(4f)) { keyPadLabel ->
                keyListener(label = keyPadLabel, mainOutput)

            }
        }
    }
}
