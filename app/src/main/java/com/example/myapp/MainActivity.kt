package com.example.myapp

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ProgressBar
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash)
    }

    override fun onResume() {
        super.onResume()
    }

    fun button_decr_listener(view: View) {
        listener(view, "decr")
    }

    fun button_incr_listener(view: View) {
        listener(view, "incr")
    }


    fun listener(view: View, string: String) {
        val numbersMap = mapOf("decr" to -1, "incr" to 1)
        val progressBar = findViewById<ProgressBar>(R.id.progress_bar)
        val progress_bar_text_view = findViewById<TextView>(R.id.progress_bar_text_view)
        if (progressBar.progress <= 95 || progressBar.progress >= 5) {
            progressBar.progress += 5* numbersMap[string]!!.toInt()
            progress_bar_text_view.text = progressBar.progress.toString()
        }
    }
}


