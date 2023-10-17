package com.freshsmart.plantis

import android.app.Application
import com.qonversion.android.sdk.Qonversion

class QonversionApp:Application() {
    override fun onCreate() {
        super.onCreate()
        Qonversion.setDebugMode()
        Qonversion.launch(this,
            key = " ",
            false
        )
    }
}