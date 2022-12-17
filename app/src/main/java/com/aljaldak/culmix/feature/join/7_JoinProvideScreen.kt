package com.aljaldak.culmix.feature.join

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.toMutableStateList
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.aljaldak.culmix.core.component.BackBar
import com.aljaldak.culmix.core.component.CulmixLargeButton
import com.aljaldak.culmix.core.theme.Body5
import com.aljaldak.culmix.feature.join.common.JoinSimpleLayout
import team.duckie.quackquack.ui.component.QuackLazyVerticalGridTag
import team.duckie.quackquack.ui.component.QuackTagType

@Composable
fun JoinProvideScreen(
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

            Body5(text = "어떤 것을 제공해주나요?")

            Spacer(modifier = Modifier.height(30.dp))


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