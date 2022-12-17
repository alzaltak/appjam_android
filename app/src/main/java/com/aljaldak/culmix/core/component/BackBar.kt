package com.aljaldak.culmix.core.component

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.aljaldak.culmix.R
import com.aljaldak.culmix.core.util.simClickable

@Composable
fun BackBar(
    onPrevious: () -> Unit,
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(
                vertical = 16.dp,
                horizontal = 30.dp,
            ),
    ) {
        Icon(
            modifier = Modifier.simClickable {
                onPrevious()
            },
            painter = painterResource(
                id = R.drawable.ic_back,
            ),
            contentDescription = null,
        )
    }
}

@Preview
@Composable
fun Preview_BackBar() {
    BackBar {
    }
}
