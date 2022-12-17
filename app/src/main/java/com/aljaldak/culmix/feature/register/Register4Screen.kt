package com.aljaldak.culmix.feature.register

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.ViewModel
import com.aljaldak.culmix.core.component.BackBar
import com.aljaldak.culmix.core.component.CulmixLargeButton
import com.aljaldak.culmix.core.component.StepsProgressBar
import com.aljaldak.culmix.core.theme.Gray300
import com.aljaldak.culmix.core.theme.Gray800
import com.aljaldak.culmix.core.theme.notoSansFamily

@Composable
fun Register4Screen(onClick: () -> Unit, viewModel: ViewModel) {

    Column(modifier = Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier.padding(start = 30.dp, end = 30.dp)
        ) {
            BackBar {

            }
            StepsProgressBar(
                numberOfSteps = 5, currentStep = 4, modifier = Modifier.padding(vertical = 30.dp)
            )
            Text(
                text = "회원가입",
                textAlign = TextAlign.Center,
                fontFamily = notoSansFamily,
                fontSize = 18.sp,
                color = Color.Black,
                modifier = Modifier.padding(vertical = 40.dp)
            )

            Box(
                modifier = Modifier
                    .border(width = 1.dp, color = Gray300, shape = CircleShape)
                    .size(100.dp)
                    .align(CenterHorizontally)
            ) {
                Icon(
                    painter = painterResource(id = com.aljaldak.culmix.R.drawable.ic_round_plus),
                    contentDescription = "",
                    modifier = Modifier.align(Alignment.Center)
                )
            }

            Text(
                text = "프로필 사진 변경",
                fontFamily = notoSansFamily,
                color = Gray800,
                modifier = Modifier.align(CenterHorizontally)
            )
        }
        Spacer(modifier = Modifier.weight(1f))

        CulmixLargeButton(
            text = "다음",
            onClick = onClick,
        )
    }
}