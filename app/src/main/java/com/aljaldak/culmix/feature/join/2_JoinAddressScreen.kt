package com.aljaldak.culmix.feature.join

import androidx.compose.foundation.layout.*
import androidx.compose.material.Surface
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.aljaldak.culmix.core.component.BackBar
import com.aljaldak.culmix.core.component.CulmixLargeButton
import com.aljaldak.culmix.core.component.CulmixTextField
import com.aljaldak.culmix.core.theme.Body1
import com.aljaldak.culmix.feature.join.common.BlueButton
import com.aljaldak.culmix.feature.join.common.JoinSimpleLayout

@Composable
fun JoinAddressScreen(
    onPrevious: () -> Unit,
    onNext: () -> Unit,
) {
    var postAddress by remember { mutableStateOf("") }
    var postAddress2 by remember { mutableStateOf("") }
    var postDetailAddress by remember { mutableStateOf("") }

    JoinSimpleLayout(
        topContent = {
            BackBar {
                onPrevious()
            }
        },
        content = {
            Spacer(modifier = Modifier.height(30.dp))

            Body1(text = "어디에 있는 집인가요?")

            Spacer(modifier = Modifier.height(24.dp))

            Row(
                modifier = Modifier.fillMaxWidth()
            ) {
                Surface(modifier = Modifier.weight(1f)) {
                    CulmixTextField(
                        modifier = Modifier
                            .padding(top = 12.dp),
                        value = postAddress,
                        onValueChange = {
                            postAddress = it
                        },
                        hint = "우편번호를 입력해주세요.",
                    )
                }

                Spacer(modifier = Modifier.width(12.dp))

                BlueButton(
                    onClick = {},
                )
            }

            Spacer(modifier = Modifier.height(40.dp))

            CulmixTextField(
                modifier = Modifier
                    .padding(top = 12.dp),
                value = postAddress2,
                onValueChange = {
                    postAddress2 = it
                },
            )

            Spacer(modifier = Modifier.height(40.dp))

            CulmixTextField(
                modifier = Modifier
                    .padding(top = 12.dp),
                value = postDetailAddress,
                onValueChange = {
                    postDetailAddress = it
                },
                hint = "상세주소입력",
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
fun PreviewJoinAddressScreen() {
    JoinAddressScreen(
        onPrevious = {}) {

    }
}