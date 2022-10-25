package com.practice.quizapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.ProgressBar
import android.widget.TextView
import androidx.core.content.ContextCompat

class QuizQuestionActivity : AppCompatActivity() {

    //        Importing IDs from the UI (xml) page
    private var progressBar: ProgressBar? = null
    private var textViewProgressNumbers: TextView? = null
    private var textViewQuestion: TextView? = null
    private var textOption: TextView? = null
    private var imageViewImage: ImageView? = null
    private var answerOptionsLayout: LinearLayout? = null

    private var textView_options: TextView? = null
//    private var textView_option2 : TextView? = null
//    private var textView_option3 : TextView? = null
//    private var textView_option4 : TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_question)

//        linking textView IDs with values on Kotlin to be able to manipulate
        progressBar = findViewById(R.id.progressBar)
        textViewProgressNumbers = findViewById(R.id.TextView_progressNumbers)
        textViewQuestion = findViewById(R.id.textView_questions)
        imageViewImage = findViewById(R.id.imageView_image)
        answerOptionsLayout = findViewById(R.id.answer_options)


//        textView_option1 = findViewById(R.id.textView_option1)
//        textView_option2 = findViewById(R.id.textView_option2)
//        textView_option3 = findViewById(R.id.textView_option3)
//        textView_option4 = findViewById(R.id.textView_option4)


        val questionList = Constant.getQuestions()
        val optionList = Constant.optionList

//    val question1 = Question()
        Log.i("questionsList size is", "${questionList.size}")
        for (item in questionList) {
//            for every object in the question data class
            Log.e("questions", item.questions)

//            log "questions" and the strings within the Question class data ('i'),
//            `.questions` is what we names the the string to ask users the questions.
        }

        for (itemFromTheList in optionList) {
            val textOption = TextView(this) //empty TextView
            textOption.text = itemFromTheList //
            textOption.background = ContextCompat.getDrawable(this, R.drawable.default_option_border)
            /*^ bringing the boarder around the answer option Strings.
            - `ContextCompat` is the oven to bring (to bake) the "recipe"
            - (which is the `default_option_border` xml page) into
            - cake (which, in this case is when you run the app - APK)

            you are creating TextView from xml in here like Compose.
             */
            answerOptionsLayout?.addView(textOption)
        }

        // DON'T UNDERSTAND WHY WE ARE ALIGNING IT AGAIN WHEN WE'VE FOUND THE ID.
        val currentPosition = 1
        val questionClass: Question = questionList[0]
        progressBar?.progress = currentPosition // WHY IS IT NOT THE OTHER WAY ROUND??
        textViewProgressNumbers?.text = "$currentPosition/${progressBar?.max}"
        textViewQuestion?.text = questionClass.questions
//        textOption?.text = questionClass.questions
        imageViewImage?.setImageResource(questionClass.image)

//        textView_options?.text = questionClass.option1
////        textView_option1?.text = questionClass.option1
////        textView_option2?.text = questionClass.option2
////        textView_option3?.text = questionClass.option3
////        textView_option4?.text = questionClass.option4

    }
}