package com.aljaldak.culmix.feature.join

import androidx.compose.animation.Crossfade
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.tooling.preview.Preview

private const val JoinDefaultInfoScreen: Int = 0
private const val JoinAddressScreen: Int = 1
private const val JoinNumberScreen: Int = 2
private const val JoinDateScreen: Int = 3
private const val JoinPhotoScreen: Int = 4

@Composable
fun JoinScreen(
    onPrevious: () -> Unit,
) {

    val pageState = remember { mutableStateOf(0) }

    Crossfade(targetState = pageState.value) { page ->
        when (page) {
            JoinDefaultInfoScreen -> JoinDefaultInfoScreen(
                onPrevious = {
                    onPrevious()
                },
                onNext = {
                    pageState.value++
                },
            )
            JoinAddressScreen -> JoinAddressScreen(
                onPrevious = {
                    pageState.value--
                },
                onNext = {
                    pageState.value++
                },
            )
            JoinNumberScreen -> JoinNumberScreen(
                onPrevious = {
                    pageState.value--
                },
                onNext = {
                    pageState.value++
                },
            )
            JoinDateScreen -> JoinDateScreen(
                onPrevious = {
                    pageState.value--
                },
                onNext = {
                    pageState.value++
                },
            )
            JoinPhotoScreen -> JoinPhotoScreen(
                onPrevious = {
                    pageState.value--
                },
                onNext = {
                    onPrevious()
                },
            )
        }
    }
}

@Preview
@Composable
fun PreviewJoinScreen() {
    JoinScreen(
        onPrevious = {},
    )
}
