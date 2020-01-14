package com.jin.ktafds.viewmodel

import androidx.databinding.ObservableField

class ViewModelDemo{

    var welcomeText = ObservableField<String>()


    fun sayHello() {
        welcomeText.set("" + Math.random())
        println(welcomeText.get())
    }
}