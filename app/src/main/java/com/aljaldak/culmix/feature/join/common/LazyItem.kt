package com.aljaldak.culmix.feature.join.common

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.aljaldak.culmix.core.theme.Body5
import com.aljaldak.culmix.core.theme.Gray600

@Composable
fun LazyItem(
    item: String,
) {
    Box(
        modifier = Modifier
            .border(
                width = 1.dp,
                shape = RoundedCornerShape(15.dp),
                color = Gray600,
            )
    ) {
        Body5(
            modifier = Modifier.padding(
                horizontal = 12.dp,
                vertical = 4.dp
            ),
            text = item,
            color = Gray600,
        )
    }
}