package com.example.quiz_app

data class Questions(
    val id : Int,
    val questions : String,
    val image : Int,
    val optionOne : String,
    val optionTwo : String,
    val optionThree : String,
    val optionFour : String,
    val correctAnswer : Int


)