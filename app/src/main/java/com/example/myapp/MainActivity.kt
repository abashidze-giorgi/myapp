package com.example.myapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

abstract class MainActivity : AppCompatActivity() {

    val but1 = R.id.button_decr
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash)
    }
}

