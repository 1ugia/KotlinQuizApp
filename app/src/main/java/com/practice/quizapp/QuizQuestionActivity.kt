package com.practice.quizapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView

class QuizQuestionActivity : AppCompatActivity() {

    //        Importing IDs from the UI (xml) page
    private var progressBar : ProgressBar? = null
    private var textViewProgress : TextView? = null
    private var textViewQuestion : TextView? = null
    private var imageViewImage : ImageView? = null

    private var textView_option1 : TextView? = null
    private var textView_option2 : TextView? = null
    private var textView_option3 : TextView? = null
    private var textView_option4 : TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_question)


        val questionList = Constant.getQuestions()
//    val question1 = Question()
        Log.i("questionsList size is", "${questionList.size}")
    }
}