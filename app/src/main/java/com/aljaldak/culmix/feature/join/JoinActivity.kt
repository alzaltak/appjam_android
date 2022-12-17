package com.aljaldak.culmix.feature.join

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.aljaldak.culmix.core.theme.CulmixTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class JoinActivity : ComponentActivity() {
    override fun onCreate(
        savedInstanceState: Bundle?
    ) {
        super.onCreate(savedInstanceState)

        setContent {
            CulmixTheme {
                JoinScreen(
                    onPrevious = { finish() },
                )
            }
        }
    }
}
