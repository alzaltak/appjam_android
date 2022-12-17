package com.aljaldak.culmix.feature.register

import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.aljaldak.culmix.core.component.BackBar
import com.aljaldak.culmix.core.component.CulmixLargeButton
import com.aljaldak.culmix.core.component.StepsProgressBar
import com.aljaldak.culmix.core.theme.notoSansFamily

@Composable
fun Register2Screen(onClick: () -> Unit) {
    Column(modifier = Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier
                .padding(start = 30.dp, end = 30.dp)
        ) {
            BackBar {

            }
            StepsProgressBar(
                numberOfSteps = 5,
                currentStep = 1,
                modifier = Modifier.padding(vertical = 30.dp)
            )
            Text(
                text = "회원가입",
                textAlign = TextAlign.Center,
                fontFamily = notoSansFamily,
                fontSize = 18.sp,
                color = Color.Black,
                modifier = Modifier.padding(vertical = 40.dp)
            )
        }

        Spacer(modifier = Modifier.weight(1f))

        CulmixLargeButton(
            text = "다음",
            onClick = onClick,
        )
    }
}