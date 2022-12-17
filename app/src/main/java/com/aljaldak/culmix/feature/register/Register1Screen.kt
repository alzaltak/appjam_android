package com.aljaldak.culmix.feature.register

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.aljaldak.culmix.core.component.BackBar
import com.aljaldak.culmix.core.component.StepsProgressBar
import com.aljaldak.culmix.core.theme.notoSansFamily

@Preview
@Composable
fun RegisterScreen() {

    val firstName = remember { mutableStateOf("") }
    val lastName = remember { mutableStateOf("") }
    val email = remember { mutableStateOf("") }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(start = 30.dp)
    ) {
        BackBar {

        }
        StepsProgressBar(
            numberOfSteps = 5, currentStep = 1, modifier = Modifier.padding(vertical = 70.dp)
        )

        Text(
            text = "회원가입",
            textAlign = TextAlign.Center,
            fontFamily = notoSansFamily,
            fontSize = 18.sp,
            color = Color.Black,
            modifier = Modifier.padding(vertical = 120.dp)
        )

        TextField(
            modifier = Modifier
                .padding(vertical = 200.dp)
                .width(80.dp),
            value = firstName.value,
            onValueChange = { firstName.value = it },
            colors = TextFieldDefaults.textFieldColors(
                backgroundColor = Color(0xFFFFFFFF)
            ),
            placeholder = {
                Text(text = "성")
            })

        TextField(
            modifier = Modifier
                .padding(top = 200.dp, start = 92.dp)
                .width(188.dp),
            value = lastName.value,
            onValueChange = { lastName.value = it },
            colors = TextFieldDefaults.textFieldColors(
                backgroundColor = Color(0xFFFFFFFF)
            ),
            placeholder = {
                Text(text = "이름")
            })


        TextField(
            modifier = Modifier
                .padding(vertical = 265.dp)
                .width(188.dp),
            value = email.value,
            onValueChange = { email.value = it },
            colors = TextFieldDefaults.textFieldColors(
                backgroundColor = Color(0xFFFFFFFF)
            ),
            placeholder = {
                Text(text = "이메일")
            })
    }

}