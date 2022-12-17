package com.aljaldak.culmix.feature.register

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.hilt.navigation.compose.hiltViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class RegisterActivity: ComponentActivity() {

    private val viewModel by viewModels<RegisterViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val pageState = remember { mutableStateOf(1) }
            viewModel.pageState.observe(this) {
                pageState.value = it
            }
            when (pageState.value) {
                1 -> {
                    Register1Screen(
                        onClick = {
                            viewModel.increasePageState()
                        },
                        viewModel = viewModel,
                    )
                }
                2 -> {
                    Register2Screen(onClick = {
                        viewModel.increasePageState()
                    })
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