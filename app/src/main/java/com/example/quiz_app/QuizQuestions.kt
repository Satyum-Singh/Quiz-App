package com.example.quiz_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.SyncStateContract.Constants
import android.util.Log
import android.widget.Button
import android.widget.EditText
import com.example.quiz_app.Constraints.getQuestion

class QuizQuestions : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_questions)

        val questionsList = Constraints.getQuestion()
        Log.i("QuestionsList size is","${questionsList.size}")


    }
}