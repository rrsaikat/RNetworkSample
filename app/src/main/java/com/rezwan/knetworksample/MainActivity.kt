package com.rezwan.knetworksample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.rezwan.knetworklib.KNetwork

class MainActivity : AppCompatActivity(), KNetwork.OnNetWorkConnectivityListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        KNetwork.bind(this, lifecycle).setConnectivityListener(this)
    }

    override fun onNetConnected() {
        Log.e("Main", "onNetConnected")
    }

    override fun onNetDisConnected() {
        Log.e("Main", "onNetDisConnected")
    }
}
