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
    private var textViewProgressNumbers : TextView? = null
    private var textViewQuestion : TextView? = null
    private var imageViewImage : ImageView? = null

    private var textView_option1 : TextView? = null
    private var textView_option2 : TextView? = null
    private var textView_option3 : TextView? = null
    private var textView_option4 : TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_question)

//        linking textView IDs with values on Kotlin to be able to manipulate
        progressBar = findViewById(R.id.progressBar)
        textViewProgressNumbers = findViewById(R.id.TextView_progressNumbers)
        textViewQuestion = findViewById(R.id.textView_questions)
        imageViewImage = findViewById(R.id.imageView_image)

        textView_option1 = findViewById(R.id.textView_option1)
        textView_option2 = findViewById(R.id.textView_option2)
        textView_option3 = findViewById(R.id.textView_option3)
        textView_option4 = findViewById(R.id.textView_option4)


        val questionList = Constant.getQuestions()
//    val question1 = Question()
        Log.i("questionsList size is", "${questionList.size}")
    }
}