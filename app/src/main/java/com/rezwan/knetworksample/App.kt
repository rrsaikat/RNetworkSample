package com.rezwan.knetworksample

import android.app.Application
import com.rezwan.knetworklib.KNetwork

class App :Application() {
    override fun onCreate() {
        super.onCreate()
        KNetwork.initialize(this)
    }
}