package com.aljaldak.culmix.feature.join

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.aljaldak.culmix.R
import com.aljaldak.culmix.core.component.BackBar
import com.aljaldak.culmix.core.component.CulmixLargeButton
import com.aljaldak.culmix.core.theme.Body1
import com.aljaldak.culmix.feature.join.common.JoinSimpleLayout

@Composable
fun JoinDateScreen(
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

            Body1(text = "얼마나 지낼 수 있나요?")

            Spacer(modifier = Modifier.height(24.dp))

            Column(
                modifier = Modifier.padding(
                    horizontal = 25.dp,
                )
            ) {
                Body1(text = "부터")

                Spacer(modifier = Modifier.height(8.dp))

                Image(
                    painter = painterResource(
                        id = R.drawable.b1,
                    ),
                    contentDescription = null,
                    modifier = Modifier
                        .fillMaxWidth(),
                    contentScale = ContentScale.FillWidth,
                )

                Spacer(modifier = Modifier.height(30.dp))

                Body1(text = "부터")

                Spacer(modifier = Modifier.height(8.dp))

                Image(
                    painter = painterResource(
                        id = R.drawable.b2,
                    ),
                    contentDescription = null,
                    modifier = Modifier
                        .fillMaxWidth(),
                    contentScale = ContentScale.FillWidth,
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

@Preview
@Composable
fun PreviewJoinPhotoScreen() {
    JoinPhotoScreen(
        onPrevious = {},
        onNext = {}
    )
}
