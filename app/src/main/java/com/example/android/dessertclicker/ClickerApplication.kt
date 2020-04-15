package com.example.android.dessertclicker

import android.app.Application
import timber.log.Timber

/**
 * Created by Kuan Wah Teo on 15/04/2020
 **/

class ClickerApplication: Application() {
    override fun onCreate() {
        super.onCreate()

        Timber.plant(Timber.DebugTree())
    }
}