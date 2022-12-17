package com.aljaldak.culmix.feature.register

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.platform.LocalContext
import androidx.lifecycle.viewmodel.compose.viewModel

class RegisterActivity : ComponentActivity() {

    private val viewModel by viewModels<RegisterViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val pageState = remember {
                mutableStateOf(1)
            }
            when (pageState.value) {
                1 -> {
                    Register1Screen(onClick = {
                        pageState.value++
                    }, viewModel = viewModel(LocalContext.current as RegisterActivity))
                }
                2 -> {
                    Register2Screen()
                }
                3 -> {
                    Register3Screen()
                }
                4 -> {

                }
                5 -> {

                }
            }
        }
    }
}