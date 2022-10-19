package com.example.android3lesson1.helper

import android.content.Context
import android.widget.Toast

fun Context.showMyToast(msg: String){
    Toast.makeText(this,msg,Toast.LENGTH_LONG).show()
}