package com.aljaldak.culmix.core

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import com.aljaldak.culmix.core.theme.Black
import com.aljaldak.culmix.core.theme.Gray100
import com.aljaldak.culmix.core.theme.Main

private val DarkColorPalette = darkColors(
    primary = Main,
    primaryVariant = Black,
    secondary = Gray100
)

private val LightColorPalette = lightColors(
    primary = Main,
    primaryVariant = Black,
    secondary = Gray100

    /* Other default colors to override
    background = Color.White,
    surface = Color.White,
    onPrimary = Color.White,
    onSecondary = Color.Black,
    onBackground = Color.Black,
    onSurface = Color.Black,
    */
)

@Composable
fun CulmixTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable() () -> Unit
) {
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

    MaterialTheme(
        colors = colors,
        shapes = Shapes,
        content = content
    )
}
