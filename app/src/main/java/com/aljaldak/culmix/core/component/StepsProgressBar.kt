package com.aljaldak.culmix.core.component

import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Divider
import androidx.compose.material.LinearProgressIndicator
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterStart
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.aljaldak.culmix.core.theme.Gray300
import com.aljaldak.culmix.core.theme.Main
import com.aljaldak.culmix.core.theme.Red
import kotlinx.coroutines.delay

@Composable
fun StepsProgressBar(modifier: Modifier = Modifier, numberOfSteps: Int, currentStep: Int) {
    Row(
        modifier = modifier,
        verticalAlignment = Alignment.CenterVertically
    ) {
        for (step in 1..numberOfSteps) {
            Step(
                modifier = Modifier.weight(1F),
                isCompete = step <= currentStep,
                isCurrent = step == currentStep,
                isFirst = step == 1
            )
        }
    }
}

@Composable
fun Step(modifier: Modifier = Modifier, isCompete: Boolean, isCurrent: Boolean, isFirst: Boolean) {
    val color = if (isCompete) Main else Gray300
    val viewSize = if (isCurrent) 11.dp else 7.dp

    if (isFirst) {
        Box(
            modifier = Modifier
                .size(viewSize)
                .clip(shape = CircleShape)
                .background(color)
        )
    } else {
        Box(modifier = modifier) {

            var progress by remember { mutableStateOf(0.1f) }

            val animatedProgress by animateFloatAsState(
                targetValue = progress,
            )

            LaunchedEffect(true) {
                while ((progress < 1)) {
                    progress += 0.01f
                    delay(10)
                }
            }

            //Line
            if (isCurrent) {
                LinearProgressIndicator(
                    progress = animatedProgress,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(2.dp)
                        .align(CenterStart),
                    color = color
                )
            } else {
                Divider(
                    modifier = Modifier
                        .align(Alignment.CenterStart)
                        .animateContentSize(),
                    color = color,
                    thickness = 2.dp
                )
            }

            //Circle
            Box(
                modifier = Modifier
                    .size(viewSize)
                    .align(Alignment.CenterEnd)
                    .clip(shape = CircleShape)
                    .background(color)
            )
        }
    }
}

@Preview
@Composable
fun StepsProgressBarPreview() {
    val currentStep = remember { mutableStateOf(3) }
    StepsProgressBar(
        modifier = Modifier.fillMaxWidth(),
        numberOfSteps = 5,
        currentStep = currentStep.value
    )
}