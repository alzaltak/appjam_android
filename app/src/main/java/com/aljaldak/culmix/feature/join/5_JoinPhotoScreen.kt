package com.aljaldak.culmix.feature.join

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.aljaldak.culmix.R
import com.aljaldak.culmix.core.component.BackBar
import com.aljaldak.culmix.core.component.CulmixLargeButton
import com.aljaldak.culmix.core.theme.Body1
import com.aljaldak.culmix.feature.join.common.JoinSimpleLayout

@Composable
fun JoinPhotoScreen(
    onPrevious: () -> Unit,
    onNext: () -> Unit,
) {
    JoinSimpleLayout(
        topContent = {
            BackBar {
                onPrevious()
            }
        },
        content = {
            Spacer(modifier = Modifier.height(30.dp))

            Body1(
                text = "집을 잘 표현할 수 있는 사진을 \n" +
                    "3장 이상 찍어주세요!",
            )

            Spacer(modifier = Modifier.height(24.dp))

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center
            ) {
                Image(
                    painter = painterResource(
                        id = R.drawable.ic_image_upload,
                    ),
                    contentDescription = null,
                )

                Spacer(modifier = Modifier.width(30.dp))

                Image(
                    painter = painterResource(
                        id = R.drawable.ic_image_upload,
                    ),
                    contentDescription = null,
                )

                Spacer(modifier = Modifier.width(30.dp))

                Image(
                    painter = painterResource(
                        id = R.drawable.ic_image_upload,
                    ),
                    contentDescription = null,
                )
            }
        },
        bottomContent = {
            CulmixLargeButton(
                text = "NEXT",
                onClick = {
                    onNext()
                },
            )
        }
    )
}
