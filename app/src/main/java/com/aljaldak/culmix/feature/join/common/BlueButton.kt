package com.aljaldak.culmix.feature.join.common

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.aljaldak.culmix.core.theme.Blue
import com.aljaldak.culmix.core.theme.Body1
import com.aljaldak.culmix.core.theme.LightenBlue
import com.aljaldak.culmix.core.theme.Sub
import com.aljaldak.culmix.core.util.simClickable

@Composable
internal fun BlueButton(
    onClick: () -> Unit,
) {
    Box(
        modifier = Modifier
            .size(90.dp, 36.dp)
            .background(
                color = LightenBlue,
                shape = RoundedCornerShape(6.dp),
            )
            .simClickable {
                onClick()
            },
        contentAlignment = Alignment.Center,
    ) {
        Body1(
            text = "우편번호 검색",
            color = Blue,
        )
    }
}