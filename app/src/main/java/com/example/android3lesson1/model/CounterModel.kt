package com.example.android3lesson1.model

import android.widget.Toast

class CounterModel {

    var count = 0
    var text = "Поздравляю!"
    var color = "#FFFFFF"

    fun increment(){
        count++
    }

    fun decrement(){
        count--
    }

    fun myGreenColor(){
        color = "#00CC00"
    }
    fun myWhiteColor(){
        color = "#FFFFFF"
    }
}