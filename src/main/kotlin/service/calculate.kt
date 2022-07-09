package service

import utils.KeyPadLabel
import androidx.compose.runtime.MutableState
import androidx.compose.ui.text.input.TextFieldValue
import org.mariuszgromada.math.mxparser.Expression
import java.math.BigDecimal
import java.math.MathContext
import java.math.RoundingMode

val OPERATORS = arrayOf('+', '-', '*', '/')

//todo: logic for %
fun calculate(input: String): String? {
    val expression = input.replace('x', '*').replace('÷', '/')

    if (!OPERATORS.any { expression.contains(it) } || OPERATORS.any { expression.endsWith(it) }) {
        return null
    }

    return try {
        val result = BigDecimal(Expression(expression).calculate())
            .round(MathContext(10, RoundingMode.HALF_UP))
            .setScale(10, RoundingMode.HALF_UP)
            .stripTrailingZeros()
        result.toPlainString()
    } catch (e: Exception) {
        null
    }

}

fun keyListener(label: KeyPadLabel, mainOutput: MutableState<TextFieldValue>) {

    when (label) {

        KeyPadLabel.CUT -> {
            val textValue = mainOutput.value.text
            if (textValue.isNotEmpty()) {
                mainOutput.value = TextFieldValue(
                    text = if (textValue.length == 1) {
                        "0"
                    } else {
                        textValue.substring(0, textValue.length - 1)
                    }
                )
            }
        }

        KeyPadLabel.CLEAR -> {
            mainOutput.value = TextFieldValue("0")
        }

        KeyPadLabel.EQUALS -> {
            calculate(mainOutput.value.text)?.let { result ->
                mainOutput.value = TextFieldValue(text = result)
            }
        }

        else -> {
            val textValue = mainOutput.value.text.let {
                if (it == "0") label.labelToNum() else it +  label.labelToNum()
            }
            mainOutput.value = TextFieldValue(text = textValue)
        }

    }

}
