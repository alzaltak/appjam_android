package com.aljaldak.culmix.feature.join.common

import androidx.compose.material.Divider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.layout
import androidx.compose.ui.unit.dp
import com.aljaldak.culmix.core.theme.Gray300

/**
 * padding이 ignore되는 divider
 */
@Composable
internal fun JoinDivider() {
    Divider(
        color = Gray300,
        thickness = 8.dp,
        modifier = Modifier
            .layout(){ measurable, constraints ->
                val placeable = measurable.measure(constraints.copy(
                    maxWidth = constraints.maxWidth + 32.dp.roundToPx(), //add the end padding 16.dp
                ))

                layout(placeable.width, placeable.height) {
                    placeable.place(0, 0)
                }
            }
    )
}
