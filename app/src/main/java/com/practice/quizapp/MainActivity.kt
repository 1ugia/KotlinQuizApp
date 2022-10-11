package com.practice.quizapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.widget.AppCompatEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn_start : Button = findViewById(R.id.btn_start)
        val editTextNameField : AppCompatEditText = findViewById(R.id.EditText_name_field)
        btn_start.setOnClickListener{
            if(editTextNameField.text.isEmpty()){
                Toast.makeText(
                    this,
                    "please enter your name",
                    Toast.LENGTH_LONG
                ).show()
            }
        }
    }
}