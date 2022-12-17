package com.aljaldak.culmix.feature.register

import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.ViewModel
import com.aljaldak.culmix.core.component.BackBar
import com.aljaldak.culmix.core.component.CulmixLargeButton
import com.aljaldak.culmix.core.component.StepsProgressBar
import com.aljaldak.culmix.core.theme.Main
import com.aljaldak.culmix.core.theme.notoSansFamily

@Composable
fun Register3Screen(onClick: () -> Unit, viewModel: ViewModel) {

    val id = remember { mutableStateOf("") }
    val password = remember { mutableStateOf("") }
    val passwordCheck = remember { mutableStateOf("") }

    Column(modifier = Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier
                .padding(start = 30.dp, end = 30.dp)
        ) {
            BackBar {

            }
            StepsProgressBar(
                numberOfSteps = 5,
                currentStep = 3,
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

            TextField(
                modifier = Modifier
                    .fillMaxWidth(),
                value = id.value,
                onValueChange = { id.value = it },
                colors = TextFieldDefaults.outlinedTextFieldColors(
                    backgroundColor = Color(0xFFFFFFFF),
                    focusedBorderColor = Main
                ),
                placeholder = {
                    Text(text = "아이디")
                })

            TextField(
                modifier = Modifier
                    .fillMaxWidth(),
                value = password.value,
                onValueChange = { password.value = it },
                colors = TextFieldDefaults.outlinedTextFieldColors(
                    backgroundColor = Color(0xFFFFFFFF),
                    focusedBorderColor = Main
                ),
                placeholder = {
                    Text(text = "비밀번호")
                })

            TextField(
                modifier = Modifier
                    .fillMaxWidth(),
                value = passwordCheck.value,
                onValueChange = { passwordCheck.value = it },
                colors = TextFieldDefaults.outlinedTextFieldColors(
                    backgroundColor = Color(0xFFFFFFFF),
                    focusedBorderColor = Main
                ),
                placeholder = {
                    Text(text = "비밀번호 재확인")
                })
        }
        Spacer(modifier = Modifier.weight(1f))

        CulmixLargeButton(
            text = "다음",
            onClick = onClick,
            enabled = id.value.isNotEmpty() && password.value.isNotEmpty() && passwordCheck.value.isNotEmpty()
        )
    }
}