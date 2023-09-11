package com.example.quiz_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import android.content.Intent as Intent1

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn_start : Button = findViewById(R.id.btn_start)
        val et_name : EditText = findViewById(R.id.et_name)

        btn_start.setOnClickListener{
            if(et_name.text.isEmpty()){
                Toast.makeText(this,"Please enter your name to begin",Toast.LENGTH_SHORT).show()
            }
            else{
                val intent = Intent1(this,QuizQuestions::class.java)
                startActivity(intent)
                finish()
            }
        }

    }
}