package com.aljaldak.culmix.feature.join

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.runtime.toMutableStateList
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.aljaldak.culmix.core.component.BackBar
import com.aljaldak.culmix.core.component.CulmixLargeButton
import com.aljaldak.culmix.core.component.CulmixTextField
import com.aljaldak.culmix.core.theme.Body5
import com.aljaldak.culmix.feature.join.common.JoinSimpleLayout
import team.duckie.quackquack.ui.component.QuackLazyVerticalGridTag
import team.duckie.quackquack.ui.component.QuackTagType

@Composable
fun JoinTitleScreen(
    onPrevious: () -> Unit,
    onNext: () -> Unit,
) {
    var title by remember { mutableStateOf("") }
    var content by remember { mutableStateOf("") }

    JoinSimpleLayout(
        topContent = {
            BackBar {
                onPrevious()
            }
        },
        content = {
            Spacer(modifier = Modifier.height(30.dp))

            Body5(text = "어떤 분에게 추천하나요?")

            Spacer(modifier = Modifier.height(50.dp))

            CulmixTextField(
                value = title,
                onValueChange = {
                    title = it
                },
                hint = "한 줄 소개 (제목)"
            )

            Spacer(modifier = Modifier.height(50.dp))

            CulmixTextField(
                value = content,
                onValueChange = {
                    content = it
                },
                hint = "간단한 소개글"
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