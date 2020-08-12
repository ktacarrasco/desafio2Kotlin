package com.example.myappciclobike

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listSetupCiclovias:SetupCiclovias
        Log.d("LOG",SetupCiclovias().init().toString())
        Log.d("LOG",SetupCiclovias().init1().toString())

    }
}