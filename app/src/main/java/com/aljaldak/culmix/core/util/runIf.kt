package com.aljaldak.culmix.core.util

internal inline fun <T> T.runIf(condition: Boolean, run: T.() -> T) = if (condition) {
    run()
} else this
