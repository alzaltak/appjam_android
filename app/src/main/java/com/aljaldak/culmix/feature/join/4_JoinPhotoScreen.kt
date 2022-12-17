package com.aljaldak.culmix.feature.join

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.aljaldak.culmix.core.component.BackBar
import com.aljaldak.culmix.core.component.CulmixLargeButton
import com.aljaldak.culmix.core.theme.Body1
import com.aljaldak.culmix.feature.join.common.HouseTypeContent
import com.aljaldak.culmix.feature.join.common.JoinDivider
import com.aljaldak.culmix.feature.join.common.JoinSimpleLayout
import com.aljaldak.culmix.feature.join.common.UpDownContent
import retrofit2.http.Body

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

            Body1(text = "얼마나 지낼 수 있나요?")

            Spacer(modifier = Modifier.height(24.dp))

            Column(
                modifier = Modifier.padding(
                    horizontal = 25.dp,
                )
            ) {
                Body1(text = "부터")


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
