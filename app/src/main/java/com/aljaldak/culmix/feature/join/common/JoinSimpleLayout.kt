package com.aljaldak.culmix.feature.join.common

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun JoinSimpleLayout(
    topContent: @Composable () -> Unit,
    content: @Composable () -> Unit,
    bottomContent: @Composable () -> Unit,
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {
        topContent()

        Column(
            modifier = Modifier
                .padding(horizontal = 30.dp)
        ) {
            content()
        }

        Spacer(modifier = Modifier.weight(1f))

        bottomContent()
    }
}