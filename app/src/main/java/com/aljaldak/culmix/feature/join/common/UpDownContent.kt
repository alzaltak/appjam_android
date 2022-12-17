package com.aljaldak.culmix.feature.join.common

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.aljaldak.culmix.R
import com.aljaldak.culmix.core.theme.Body1
import com.aljaldak.culmix.core.util.simClickable

@Composable
fun UpDownContent(
    number: Int,
    onClickUp: () -> Unit,
    onClickDown: () -> Unit,
) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Image(
            painter = painterResource(id = R.drawable.ic_minus),
            contentDescription = null,
            modifier = Modifier
                .simClickable(
                    runIf = number > 0
                ) {
                    onClickDown()
                },
        )

        Spacer(modifier = Modifier.width(24.dp))

        Body1(text = "${number}개")

        Spacer(modifier = Modifier.width(24.dp))

        Image(
            painter = painterResource(id = R.drawable.ic_plus),
            contentDescription = null,
            modifier = Modifier
                .simClickable {
                    onClickUp()
                },
        )
    }
}