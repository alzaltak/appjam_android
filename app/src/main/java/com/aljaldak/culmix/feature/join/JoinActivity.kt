package com.aljaldak.culmix.feature.join

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.imePadding
import androidx.compose.ui.Modifier
import com.aljaldak.culmix.core.theme.CulmixTheme
import com.aljaldak.culmix.feature.sethome.activity.SetHomeActivity
import com.aljaldak.culmix.root.MainActivity
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
                    modifier = Modifier.imePadding(),
                    onPrevious = {
                        startActivity(
                            Intent(
                                this,
                                SetHomeActivity::class.java,
                            )
                        )
                        finish()
                    },
                )
            }
        }
    }
}
