package com.aljaldak.culmix.core.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.aljaldak.culmix.core.theme.Body3
import com.aljaldak.culmix.core.theme.Main
import com.aljaldak.culmix.core.theme.Sub
import com.aljaldak.culmix.core.theme.Title3
import com.aljaldak.culmix.core.util.simClickable

@Composable
fun CulmixLargeButton(
    text: String,
    onClick: () -> Unit,
    enabled: Boolean = true,
) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(48.dp)
            .background(
                color = if (enabled) Main else Sub,
            )
            .simClickable(
                runIf = enabled
            ) {
                onClick()
            },
        contentAlignment = Alignment.Center,
    ) {
        Title3(
            text = text,
            color = Color.White,
        )
    }
}

@Composable
fun CulmixThinButton(
    text: String,
    onClick: () -> Unit,
    enabled: Boolean = true,
) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(40.dp)
            .padding(horizontal = 16.dp)
            .background(
                color = if (enabled) Main else Sub,
                shape = RoundedCornerShape(5.dp),
            )
            .simClickable(
                runIf = enabled
            ) {
                onClick()
            },
        contentAlignment = Alignment.Center,
    ) {
        Title3(
            text = text,
            color = Color.White,
        )
    }
}

@Composable
fun CulmixRoundButton(
    text: String,
    onClick: () -> Unit,
    enabled: Boolean = true,
) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(38.dp)
            .padding(horizontal = 50.dp)
            .background(
                color = if (enabled) Main else Sub,
                shape = RoundedCornerShape(19.dp),
            )
            .simClickable(
                runIf = enabled
            ) {
                onClick()
            },
        contentAlignment = Alignment.Center,
    ) {
        Body3(
            text = text,
            color = Color.White,
        )
    }
}

@Preview
@Composable
fun PreviewButton() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.spacedBy(8.dp),
    ) {
        CulmixLargeButton(
            text = "Next",
            onClick = {},
        )

        CulmixLargeButton(
            text = "Next",
            onClick = {},
            enabled = false,
        )

        CulmixThinButton(
            text = "Next",
            onClick = {},
        )

        CulmixThinButton(
            text = "Next",
            onClick = {},
            enabled = false,
        )

        CulmixRoundButton(
            text = "Next",
            onClick = {},
        )

        CulmixRoundButton(
            text = "Next",
            onClick = {},
            enabled = false,
        )
    }
}
