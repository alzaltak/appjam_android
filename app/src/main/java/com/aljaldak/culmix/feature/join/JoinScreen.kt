package com.aljaldak.culmix.feature.join

import androidx.compose.animation.Crossfade
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

private const val JoinDefaultInfoScreen: Int = 0
private const val JoinAddressScreen: Int = 1
private const val JoinNumberScreen: Int = 2
private const val JoinDateScreen: Int = 3
private const val JoinPhotoScreen: Int = 4
private const val JoinCultureScreen: Int = 5
private const val JoinProvideScreen: Int = 6
private const val JoinRecommendScreen: Int = 7
private const val JoinTitleScreen: Int = 8

@Composable
fun JoinScreen(
    modifier: Modifier = Modifier,
    onPrevious: () -> Unit,
) {

    val pageState = remember { mutableStateOf(0) }

    Crossfade(
        modifier = modifier, targetState = pageState.value
    ) { page ->
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
                    pageState.value++
                },
            )
            JoinCultureScreen -> JoinCultureScreen(
                onPrevious = {
                    pageState.value--
                },
                onNext = {
                    pageState.value++
                },
            )
            JoinProvideScreen -> JoinProvideScreen(
                onPrevious = {
                    pageState.value--
                },
                onNext = {
                    pageState.value++
                },
            )
            JoinRecommendScreen -> JoinRecommendScreen(
                onPrevious = {
                    pageState.value--
                },
                onNext = {
                    pageState.value++
                },
            )
            JoinTitleScreen -> JoinTitleScreen(
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
