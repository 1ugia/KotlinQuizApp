package com.practice.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.widget.AppCompatEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnStart: Button = findViewById(R.id.btn_start)
        val editTextNameField: AppCompatEditText = findViewById(R.id.EditText_name_field)
        btnStart.setOnClickListener {
            if (editTextNameField.text?.isEmpty() == true) {
                Toast.makeText(
                    this,
                    "please enter your name",
                    Toast.LENGTH_LONG
                ).show()
            } else {
                val intent = Intent(
                    this,
                    QuizQuestionActivity::class.java
                )
                startActivity(intent)
                finish()
            }
        }
    }
}