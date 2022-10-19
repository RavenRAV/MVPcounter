package com.example.android3lesson1

import android.content.Context
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.android3lesson1.databinding.ActivityMainBinding
import com.example.android3lesson1.helper.Injector
import com.example.android3lesson1.helper.showMyToast
import com.example.android3lesson1.presenter.Presenter
import com.example.android3lesson1.view.CounterView

class MainActivity : AppCompatActivity(), CounterView{

    private lateinit var binding: ActivityMainBinding
    private val presenter = Injector.getPresenter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        presenter.attachView(this)
        initClickers()

    }

    private fun initClickers() {
        with(binding){
            increment.setOnClickListener {
                presenter.increment()
                presenter.myToast()
                presenter.changeColor()
            }
            decrement.setOnClickListener {
                presenter.decrement()
                presenter.myToast()
                presenter.changeColor()
            }
        }
    }

    override fun showNewCount(count: Int) {
        binding.number.text = count.toString()
    }

    override fun showToast(text: String) {
       showMyToast(text)
    }

    override fun showNewColor(color: String) {
        binding.number.setTextColor(Color.parseColor(color))
    }
}