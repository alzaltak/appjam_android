package com.aljaldak.culmix.core.component

import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import com.aljaldak.culmix.core.theme.Gray300
import com.aljaldak.culmix.core.theme.Main
import com.aljaldak.culmix.core.util.simClickable

@Composable
fun LanguageItem(text: String, selected: Boolean = false, onClick: () -> Unit) {
    Box(
        modifier = Modifier
            .padding(start = 12.dp, end = 12.dp, top = 4.dp, bottom = 4.dp)
            .clip(
                RoundedCornerShape(15.dp)
            )
            .border(width = 1.dp, shape = RoundedCornerShape(15.dp), color = if(selected) Main else Gray300)
            .simClickable { onClick() }
    ) {
        Text(text = text, modifier = Modifier.align(Alignment.Center), color = if (selected) Main else Gray300)
    }
}
