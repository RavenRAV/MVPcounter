package com.example.android3lesson1.helper

import android.content.Context
import android.widget.Toast
import com.example.android3lesson1.model.CounterModel
import com.example.android3lesson1.presenter.Presenter

class Injector {

    companion object{
        fun getModel(): CounterModel{
            return CounterModel()
        }
        fun getPresenter():Presenter{
            return Presenter()
        }

    }
}