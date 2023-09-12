package com.example.quiz_app

import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.SyncStateContract.Constants
import android.util.Log
import android.view.View
import android.view.ViewConfiguration
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import androidx.appcompat.content.res.AppCompatResources.getDrawable
import androidx.core.content.ContextCompat
import androidx.core.content.ContextCompat.getDrawable


class QuizQuestions : AppCompatActivity(), View.OnClickListener {


    private var mCurrentPosition : Int =1;
    private var mQuestionsList : ArrayList<Questions>? = null
    private var mSelectedOptionPosition : Int = 0;

    private var progressBar: ProgressBar? = null
    private var tvProgress : TextView? = null
    private var tvQuestion : TextView? = null
    private var ivImage : ImageView? = null

    private var tvOptionOne : TextView? = null
    private var tvOptionTwo : TextView? = null
    private var tvOptionThree : TextView? = null
    private var tvOptionFour : TextView? = null
    private var btnSubmit : Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_questions)

        progressBar = findViewById(R.id.progressbar)
        tvProgress = findViewById(R.id.tv_progress)
        tvQuestion = findViewById(R.id.tv_ques)
        ivImage = findViewById(R.id.iv_image)

        tvOptionOne = findViewById(R.id.tv_option_one)
        tvOptionTwo = findViewById(R.id.tv_option_two)
        tvOptionThree = findViewById(R.id.tv_option_three)
        tvOptionFour =findViewById(R.id.tv_option_four)

        tvOptionOne?.setOnClickListener(this)
        tvOptionTwo?.setOnClickListener(this)
        tvOptionThree?.setOnClickListener(this)
        tvOptionFour?.setOnClickListener(this)
        btnSubmit?.setOnClickListener(this)

        mQuestionsList = Constraints.getQuestion()
        btnSubmit = findViewById(R.id.submit)
        setQuestion()


    }

    private fun setQuestion() {

        mCurrentPosition = 1
        val question: Questions = mQuestionsList!![mCurrentPosition - 1]
        progressBar?.progress = mCurrentPosition
        tvProgress?.text = "$mCurrentPosition / ${progressBar?.max}"
        tvQuestion?.text = question.question
        ivImage?.setImageResource(question.image)
        tvOptionOne?.text = question.optionOne
        tvOptionTwo?.text = question.optionTwo
        tvOptionThree?.text = question.optionThree
        tvOptionFour?.text = question.optionFour

        if(mCurrentPosition == mQuestionsList!!.size){
           btnSubmit?.text = "Finish"
        }
        else{
            btnSubmit?.text = "Submit"
        }

    }

    private fun defaultOptionsView(){

        val options = ArrayList<TextView>()
        tvOptionOne?.let{
            options.add(0,it)
        }
        tvOptionTwo?.let{
            options.add(1,it)
        }
        tvOptionThree?.let{
            options.add(2,it)
        }
        tvOptionFour?.let{
            options.add(3,it)
        }

        for(option in options){
            option.setTextColor(Color.parseColor("#7a8089"))
            option.typeface = Typeface.DEFAULT
            option.background = ContextCompat.getDrawable(
                this,
                R.drawable.selected_option_border_bg
            )
        }

    }

    private fun selectedOptionView(tv : TextView , selectedOption : Int){
        defaultOptionsView()

        mSelectedOptionPosition = selectedOption
        tv.setTextColor(Color.parseColor("#363a43"))
        tv.setTypeface(tv.typeface,Typeface.BOLD)
        tv.background = ContextCompat.getDrawable(
            this,
            R.drawable.selected_option_border_bg
        )
    }


    override fun onClick(view: View?) {
        when(view?.id){
            R.id.tv_option_one -> {
                tvOptionOne?.let{
                    selectedOptionView(it,1)
                }
            }

            R.id.tv_option_two -> {
                tvOptionTwo?.let{
                    selectedOptionView(it,2)
                }
            }

            R.id.tv_option_three -> {
                tvOptionThree?.let{
                    selectedOptionView(it,3)
                }
            }

            R.id.tv_option_four -> {
                tvOptionFour?.let{
                    selectedOptionView(it,4)
                }
            }

//            R.id.btn_submit -> {
//                //Todo "implement btn submit"
//            }

        }
    }
}