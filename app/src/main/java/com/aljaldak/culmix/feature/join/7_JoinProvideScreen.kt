package com.aljaldak.culmix.feature.join

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.runtime.toMutableStateList
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.aljaldak.culmix.R
import com.aljaldak.culmix.core.component.BackBar
import com.aljaldak.culmix.core.component.CulmixLargeButton
import com.aljaldak.culmix.core.theme.Body5
import com.aljaldak.culmix.core.util.simClickable
import com.aljaldak.culmix.feature.join.common.JoinSimpleLayout
import team.duckie.quackquack.ui.component.QuackLazyVerticalGridTag
import team.duckie.quackquack.ui.component.QuackTagType

@Composable
fun JoinProvideScreen(
    onPrevious: () -> Unit,
    onNext: () -> Unit,
) {
    var click1 by remember { mutableStateOf(false) }
    var click2 by remember { mutableStateOf(false) }
    var click3 by remember { mutableStateOf(false) }

    JoinSimpleLayout(
        topContent = {
            BackBar {
                onPrevious()
            }
        },
        content = {
            Spacer(modifier = Modifier.height(30.dp))

            Body5(text = "어떤 것을 제공해주나요?")

            Spacer(modifier = Modifier.height(30.dp))

            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.Center,
            ) {
                if (click1) {
                    Image(
                        modifier = Modifier.size(80.dp, 108.dp),
                        painter = painterResource(
                            id = R.drawable.rprovide1,
                        ),
                        contentDescription = null,
                    )
                } else {
                    Image(
                        modifier = Modifier
                            .size(80.dp, 108.dp)
                            .simClickable {
                                click1 = true
                            },
                        painter = painterResource(
                            id = R.drawable.provide1,
                        ),
                        contentDescription = null,
                    )
                }

                Spacer(modifier = Modifier.width(20.dp))

                if (click2) {
                    Image(
                        modifier = Modifier
                            .size(80.dp, 108.dp),
                        painter = painterResource(
                            id = R.drawable.rprodive2,
                        ),
                        contentDescription = null,
                    )
                } else {
                    Image(
                        modifier = Modifier
                            .size(80.dp, 108.dp)
                            .simClickable {
                                click2 = true
                            },
                        painter = painterResource(
                            id = R.drawable.provide2,
                        ),
                        contentDescription = null,
                    )
                }

                Spacer(modifier = Modifier.width(20.dp))

                if (click3) {
                    Image(
                        modifier = Modifier.size(80.dp, 108.dp),
                        painter = painterResource(
                            id = R.drawable.rprovide3,
                        ),
                        contentDescription = null,
                    )
                } else {
                    Image(
                        modifier = Modifier
                            .size(80.dp, 108.dp)
                            .simClickable {
                                click3 = true
                            },
                        painter = painterResource(
                            id = R.drawable.provide3,
                        ),
                        contentDescription = null,
                    )
                }
            }

            Spacer(modifier = Modifier.height(19.dp))

            Image(
                painter = painterResource(id = R.drawable.bg_provide),
                contentDescription = null,
                modifier = Modifier.size(283.dp, 362.dp)
            )
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
fun PreviewJoinProvideScreen() {
    JoinProvideScreen(onPrevious = { /*TODO*/ }) {

    }
}