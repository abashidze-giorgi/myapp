package com.example.myapp

import android.content.Intent
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
        setContentView(R.layout.login_activity)
    }

    fun button_decr_listener(view: View) {
        progress_bar_listener(view, "decr")
    }

    fun button_incr_listener(view: View) {
        progress_bar_listener(view, "incr")
    }


    fun progress_bar_listener(view: View, string: String) {
        val numbersMap = mapOf("decr" to -1, "incr" to 1)
        val progressBar = findViewById<ProgressBar>(R.id.progress_bar)
        val progress_bar_text_view = findViewById<TextView>(R.id.progress_bar_text_view)

        if (progressBar.progress <= 95 || progressBar.progress >= 5) {
            progressBar.progress += 5* numbersMap[string]!!.toInt()
            progress_bar_text_view.text = progressBar.progress.toString()
        }
    }

    fun logActRegisterButtonID_Click(view: View) {
        val userName = findViewById<TextView>(R.id.logActUserNameTextEdit).text.toString()
        openRegistrationActivity(view, userName)
        
    }

    private fun openRegistrationActivity(view: View, userName: String) {
        val intent = Intent(this, registration_activity::class.java).apply {
            putExtra(EXTRA_MESSAGE, message)
        }
        startActivity(intent)
    }
    }
}


