package com.example.android3lesson1.view

import android.content.Context

interface CounterView {
    fun showNewCount(count:Int)
    fun showToast(text: String)
    fun showNewColor(color:String)
}