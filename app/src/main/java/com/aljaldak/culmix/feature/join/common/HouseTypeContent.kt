package com.aljaldak.culmix.feature.join.common

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.Checkbox
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.aljaldak.culmix.core.theme.Body4
import com.aljaldak.culmix.core.theme.Body9
import com.aljaldak.culmix.core.theme.Gray600

@Composable
internal fun HouseTypeContent(
    checked: Boolean,
    onCheckedChange: (Boolean) -> Unit,
    title: String,
    content: String,
) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .shadow(elevation = 2.dp),
    ) {
        Row(
            modifier = Modifier
                .padding(
                    horizontal = 16.dp,
                    vertical = 10.dp,
                ),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Checkbox(
                checked = checked,
                onCheckedChange = onCheckedChange,
            )

            Spacer(modifier = Modifier.width(12.dp))

            Column {
                Body4(text = title)

                Spacer(modifier = Modifier.height(4.dp))

                Body9(
                    text = content,
                    color = Gray600,
                )
            }
        }
    }
}

@Preview
@Composable
fun PreviewHouseTypeContent() {
    var checked by remember { mutableStateOf(true) }
    HouseTypeContent(
        checked = checked,
        onCheckedChange = { checked = it },
        title = "sad",
        content = "testest",
    )
}