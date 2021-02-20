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

    fun button_decr_listener(view: View) {
        val progressBar = findViewById<ProgressBar>(R.id.progress_bar)
        var progress_bar_text_view = findViewById<TextView>(R.id.progress_bar_text_view)
        if(progressBar.progress >= 10){
            progressBar.progress -= 10
            progress_bar_text_view.text = progressBar.progress.toString()
        }
    }

    fun button_incr_listener(view: View) {
        val progressBar = findViewById<ProgressBar>(R.id.progress_bar)
        var progress_bar_text_view = findViewById<TextView>(R.id.progress_bar_text_view)
        if(progressBar.progress <= 90){
            progressBar.progress += 10
            progress_bar_text_view.text = progressBar.progress.toString()
        }
    }
}


