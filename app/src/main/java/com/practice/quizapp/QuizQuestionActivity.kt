 package com.practice.quizapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class QuizQuestionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_question)
    }

    val questionList = Constant.getQuestions()
//    Log.i("questionsList size is ${questionList.size}")
}