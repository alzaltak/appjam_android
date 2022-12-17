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
fun Register1Screen(onClick: () -> Unit, viewModel: ViewModel) {

    val firstName = remember { mutableStateOf("") }
    val lastName = remember { mutableStateOf("") }
    val email = remember { mutableStateOf("") }

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

            Row(modifier = Modifier.fillMaxWidth()) {
                TextField(
                    modifier = Modifier
                        .width(80.dp),
                    value = firstName.value,
                    onValueChange = { firstName.value = it },
                    colors = TextFieldDefaults.outlinedTextFieldColors(
                        backgroundColor = Color(0xFFFFFFFF),
                        focusedBorderColor = Main
                    ),
                    placeholder = {
                        Text(text = "성")
                    })

                TextField(
                    modifier = Modifier
                        .padding(start = 12.dp)
                        .width(188.dp),
                    value = lastName.value,
                    onValueChange = { lastName.value = it },
                    colors = TextFieldDefaults.outlinedTextFieldColors(
                        backgroundColor = Color(0xFFFFFFFF),
                        focusedBorderColor = Main
                    ),
                    placeholder = {
                        Text(text = "이름")
                    })

            }
            TextField(
                modifier = Modifier
                    .padding(vertical = 0.dp)
                    .fillMaxWidth(),
                value = email.value,
                onValueChange = { email.value = it },
                colors = TextFieldDefaults.outlinedTextFieldColors(
                    backgroundColor = Color(0xFFFFFFFF),
                    focusedBorderColor = Main
                ),
                placeholder = {
                    Text(text = "이메일")
                })
        }
        Spacer(modifier = Modifier.weight(1f))

        CulmixLargeButton(
            text = "다음",
            onClick = onClick,
            enabled = firstName.value.isNotEmpty() && lastName.value.isNotEmpty() && email.value.isNotEmpty()
        )
    }
}