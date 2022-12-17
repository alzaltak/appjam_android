package com.aljaldak.culmix.core.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Divider
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.aljaldak.culmix.R
import com.aljaldak.culmix.core.theme.Body3
import com.aljaldak.culmix.core.theme.Body5
import com.aljaldak.culmix.core.theme.CulmixTypography
import com.aljaldak.culmix.core.theme.Gray300
import com.aljaldak.culmix.core.theme.Gray400
import com.aljaldak.culmix.core.theme.Red

@Composable
fun CulmixTextField(
    modifier: Modifier = Modifier,
    value: String,
    onValueChange: (String) -> Unit,
    error: String? = null,
    isPassword: Boolean = false,
    keyboardType: KeyboardType = KeyboardType.Text,
    imeAction: ImeAction = ImeAction.Default,
    onClick: (() -> Unit)? = null,
    hint: String? = null,
    description: String? = null
) {
    val interactionSource = remember { MutableInteractionSource() }

    val borderColor: Color = if (error == null) Gray300 else Red

    var passwordVisible by remember {
        mutableStateOf(false)
    }

    Column {
        Column(
            modifier = modifier
                .height(24.dp)
                .background(
                    shape = RoundedCornerShape(5.dp),
                    color = Color.Transparent
                )
                .wrapContentHeight(Alignment.CenterVertically)
                .clickable(
                    interactionSource = interactionSource,
                    indication = null
                ) {
                    if (onClick != null) {
                        onClick()
                    }
                }
        ) {
            Row(
                modifier = Modifier.fillMaxSize(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                BasicTextField(
                    modifier = Modifier
                        .fillMaxWidth(0.9f)
                        .padding(start = 6.dp),
                    value = value,
                    onValueChange = onValueChange,
                    keyboardOptions = KeyboardOptions(
                        keyboardType = keyboardType,
                        imeAction = imeAction
                    ),
                    visualTransformation = if (!passwordVisible && isPassword) PasswordVisualTransformation() else VisualTransformation.None,
                    maxLines = 1,
                    textStyle = CulmixTypography.body3,
                    decorationBox = { innerTextField ->
                        if (value.isEmpty() && hint != null) {
                            Body3(text = hint, color = Gray400)
                        }

                        innerTextField()
                    },
                )
                if (isPassword) {
                    Image(
                        modifier = Modifier
                            .clickable(
                                interactionSource = interactionSource,
                                indication = null
                            ) { passwordVisible = !passwordVisible },
                        painter = if (passwordVisible) painterResource(id = R.drawable.ic_pw_visible)
                        else painterResource(id = R.drawable.ic_pw_invisible),
                        contentDescription = null,
                        alpha = if (value.isNotEmpty()) 1f else 0f
                    )
                }
            }
        }

        Divider(
            color = Gray300,
        )

        if (error != null) {
            Body5(
                text = error,
                modifier = Modifier.padding(start = 3.dp, top = 6.dp),
                color = Color.Red,
            )
        }

        if (description != null) {
            Body5(text = description, modifier = Modifier.padding(start = 3.dp, top = 6.dp))
        }
    }
}

@Preview
@Composable
fun PreviewCulmixTextField() {
    var value by remember { mutableStateOf(String()) }
    var value2 by remember { mutableStateOf(String()) }
    var value3 by remember { mutableStateOf(String()) }
    var value4 by remember { mutableStateOf(String()) }

    Column(
        modifier = Modifier.padding(horizontal = 20.dp)
    ) {
        // default text field
        CulmixTextField(
            value = value,
            onValueChange = { value = it }
        )

        Spacer(modifier = Modifier.height(15.dp))

        // password text field
        CulmixTextField(
            value = value2,
            onValueChange = { value2 = it },
            isPassword = true
        )

        Spacer(modifier = Modifier.height(15.dp))

        // error text field
        CulmixTextField(
            value = value3,
            onValueChange = { value3 = it },
            error = "특수문자는 사용할 수 없습니다!"
        )

        Spacer(modifier = Modifier.height(15.dp))

        // description text field
        CulmixTextField(
            value = value4,
            onValueChange = { value4 = it },
            description = "비밀번호는 4자리 이상 입력해주세요.",
            hint = "비밀번호"
        )
    }
}
