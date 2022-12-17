package com.aljaldak.culmix.root

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class CulmixApp: Application() {

    companion object {
        private lateinit var culmixApp: CulmixApp
    }

    override fun onCreate() {
        super.onCreate()
        culmixApp = this
    }
}