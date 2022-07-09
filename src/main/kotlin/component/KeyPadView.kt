import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import utils.*

@Composable
private fun KeyPadButtonView(label: KeyPadLabel, onClick: (KeyPadLabel) -> Unit, modifier: Modifier = Modifier, isOperand: Boolean) {

    val textColor = if (isOperand) {
        Color.White
    } else {
        Firefly
    }

    val textStyle = if (isOperand) {
        Title20
    } else {
        TitleAppBar
    }

    val mod = if (isOperand) {
        modifier
            .aspectRatio(1.5f)
            .border(color = MandysPink, width = 1.dp)
            .background(Sunglo)

    } else {
        modifier
            .aspectRatio(1.5f)
            .border(color = Sunglo, width = 1.dp)
            .background(MandysPink)
    }

    TextButton(onClick = { onClick(label) }, modifier = mod) {

        if (label == KeyPadLabel.CUT) {
            Image(
                imageVector = Assets.OutlineBackspace,
                contentDescription = "back"
            )
        } else {
            Text(
                text = label.labelToNum(),
                style = textStyle,
                color = textColor
            )
        }
    }
}

@Composable
fun KeyPadView(modifier: Modifier = Modifier, onClick: (digit: KeyPadLabel) -> Unit) {
    Box(modifier = Modifier.background(Color.White)) {
        Column(modifier.fillMaxWidth()) {
            val mod = Modifier.weight(1f)
            //row 1
            Row(Modifier.fillMaxWidth()) {
                KeyPadButtonView(KeyPadLabel.CLEAR, onClick, mod, true)
                KeyPadButtonView(KeyPadLabel.CUT, onClick, mod, true)
                KeyPadButtonView(KeyPadLabel.PERCENT, onClick, mod, true)
                KeyPadButtonView(KeyPadLabel.DIV, onClick, mod, true)
            }
            //row 2
            Row(Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically) {
                KeyPadButtonView(KeyPadLabel.SEVEN, onClick, mod, false)
                KeyPadButtonView(KeyPadLabel.EIGHT, onClick, mod, false)
                KeyPadButtonView(KeyPadLabel.NINE, onClick, mod, false)
                KeyPadButtonView(KeyPadLabel.PRODUCT, onClick, mod, true)
            }

            //row 3
            Row(Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically) {
                KeyPadButtonView(KeyPadLabel.FOUR, onClick, mod, false)
                KeyPadButtonView(KeyPadLabel.FIVE, onClick, mod, false)
                KeyPadButtonView(KeyPadLabel.SIX, onClick, mod, false)
                KeyPadButtonView(KeyPadLabel.MINUS, onClick, mod, true)
            }

            //row 4
            Row(Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically) {
                KeyPadButtonView(KeyPadLabel.ONE, onClick, mod, false)
                KeyPadButtonView(KeyPadLabel.TWO, onClick, mod, false)
                KeyPadButtonView(KeyPadLabel.THREE, onClick, mod, false)
                KeyPadButtonView(KeyPadLabel.PLUS, onClick, mod, true)
            }

            //row 5
            Row(Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically) {
                KeyPadButtonView(KeyPadLabel.ZERO, onClick, mod, false)
                KeyPadButtonView(KeyPadLabel.DOUBLE_ZERO, onClick, mod, false)
                KeyPadButtonView(KeyPadLabel.DEC, onClick, mod, false)
                KeyPadButtonView(KeyPadLabel.EQUALS, onClick, mod, true)
            }
        }
    }
}
