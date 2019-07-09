package com.bonial

import android.app.Application
import com.bonial.features.KoinModules
import timber.log.Timber

class App : Application(){

    override fun onCreate() {
        super.onCreate()
        KoinModules.initialize()
        Timber.plant(Timber.DebugTree())
    }
}
