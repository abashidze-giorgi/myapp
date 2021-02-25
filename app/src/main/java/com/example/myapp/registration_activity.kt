package com.example.myapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText

class registration_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.registration_activity)

        // Get the Intent that started this activity and extract the string
        val message = intent.getStringExtra(EXTRA_MESSAGE)
        setRegActUserNameEditTextText(message)
    }

    fun setRegActUserNameEditTextText(userName: String?){
        val regActUserNameEditText = findViewById<EditText>(R.id.regActUserNameTextEdit)
        regActUserNameEditText.text.clear()
        regActUserNameEditText.text.append(userName)
    }
}