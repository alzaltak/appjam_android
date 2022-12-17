package com.aljaldak.culmix.feature.join.common

import androidx.compose.animation.animateColorAsState
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.aljaldak.culmix.core.theme.Body4
import com.aljaldak.culmix.core.theme.Gray100
import com.aljaldak.culmix.core.theme.Gray300
import com.aljaldak.culmix.core.theme.Main
import com.aljaldak.culmix.core.util.simClickable

@Composable
fun RadioButton(
    text: String,
    onClick: () -> Unit,
    enabled: Boolean = true,
) {
    val buttonColor = animateColorAsState(targetValue = if (enabled) Main else Gray300)

    Box(
        modifier = Modifier
            .size(90.dp, 30.dp)
            .border(
                width = 1.dp,
                color = buttonColor.value,
                shape = RoundedCornerShape(4.dp),
            )
            .background(
                color = Gray100,
                shape = RoundedCornerShape(4.dp),
            )
            .simClickable {
                onClick()
            },
        contentAlignment = Alignment.Center,
    ) {
        Body4(
            text = text,
            color = buttonColor.value,
        )
    }
}

@Preview
@Composable
fun PreviewRadioButton() {
    Column(
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        RadioButton(
            text = "아파트",
            onClick = {},
        )

        RadioButton(
            text = "아파트",
            onClick = {},
            enabled = false,
        )
    }
}
