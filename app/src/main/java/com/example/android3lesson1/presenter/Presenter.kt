package com.example.android3lesson1.presenter

import com.example.android3lesson1.helper.Injector
import com.example.android3lesson1.view.CounterView

class Presenter {

    private val model = Injector.getModel()
    lateinit var view: CounterView

    fun increment(){
        model.increment()
        view.showNewCount(model.count)
    }

    fun decrement(){
        model.decrement()
        view.showNewCount(model.count)
    }

    fun myToast(){
        if (model.count == 10){
            view.showToast(model.text)
        }
    }

    fun changeColor(){
        if (model.count > 14){
            model.myGreenColor()
            view.showNewColor(model.color)
        }else{
            model.myWhiteColor()
            view.showNewColor(model.color)
        }
    }

    fun attachView(view:CounterView){
        this.view = view
    }
}