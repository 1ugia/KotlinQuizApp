package com.practice.quizapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Gravity
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.ProgressBar
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.core.view.setPadding

class QuizQuestionActivity : AppCompatActivity(), View.OnClickListener {

    //        Importing IDs from the UI (xml) page
    private var mCurrentPosition : Int = 1
    private var mQuestionList: ArrayList<Question>? = null
    private var mSelectedOptionPosition: Int = 0

    private var progressBar: ProgressBar? = null
    private var textViewProgressNumbers: TextView? = null
    private var textViewQuestion: TextView? = null
    private var textOption: TextView? = null
    private var imageViewImage: ImageView? = null
    private var answerOptionsLayout: LinearLayout? = null
    private var btnSubmit : Button? =  null

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

        mQuestionList = Constant.getQuestions()
        btnSubmit = findViewById(R.id.btn_submit)

        val questions = Constant.getQuestions()
        val questionNumber1 = questions.first()

        setQuestion(questionNumber1, questions)

    }

    private fun setQuestion(
        questionNumber1: Question,
        questions: ArrayList<Question>,
    ) {
        //    val question1 = Question()

        for (itemFromTheList in questionNumber1.options) {
            val textOption = TextView(this) //empty TextView
            textOption.text = itemFromTheList //
            textOption.background =
                ContextCompat.getDrawable(this, R.drawable.default_option_border)
            /*^ bringing the boarder around the answer option Strings.
            - `ContextCompat` is the oven to bring (to bake) the "recipe"
            - (which is the `default_option_border` xml page) into
            - cake (which, in this case is when you run the app - APK)
            you are creating TextView from xml in here like Compose.
             */
            textOption.setPadding(50)
            textOption.gravity = Gravity.CENTER
            // setting gravity on single TextView objects as we want to have control over the texts, not the entire LinearLayout
            val attributes = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT)
            // getting access to LinearLayout attributes ^^ (getting items for the recipe)
            // Setting the attributes v (getting only specific ingredients from recipe
            attributes.setMargins(10, 30, 10, 30)

            textOption.layoutParams = attributes
            answerOptionsLayout?.addView(textOption)
        }

        // DON'T UNDERSTAND WHY WE ARE ALIGNING IT AGAIN WHEN WE'VE FOUND THE ID.
        val questionClass: Question = questions.first()
        progressBar?.progress = mCurrentPosition // WHY IS IT NOT THE OTHER WAY ROUND??
        progressBar?.max = questions.size
        textViewProgressNumbers?.text = "$mCurrentPosition/${questions.size}"
        textViewQuestion?.text = questionClass.question
        //        textOption?.text = questionClass.questions
        imageViewImage?.setImageResource(questionClass.image)

        //        textView_options?.text = questionClass.option1
        ////        textView_option1?.text = questionClass.option1
        ////        textView_option2?.text = questionClass.option2
        ////        textView_option3?.text = questionClass.option3
        ////        textView_option4?.text = questionClass.option4


        if (mCurrentPosition == mQuestionList!!.size){
            btnSubmit?.text = "FINISH"
        }else{
            btnSubmit?.text = "Submit"
        }
    }

    override fun onClick(p0: View?) {
        TODO("Not yet implemented")
    }
}