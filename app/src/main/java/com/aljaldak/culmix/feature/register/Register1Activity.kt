package com.aljaldak.culmix.feature.register

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent

class Register1Activity: ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RegisterScreen()
        }
    }
}