package com.jin.ktafds.viewmodel

import androidx.lifecycle.ViewModel
import com.jin.ktafds.chinese.ChineseActivity
import com.jin.ktafds.english.EnglishActivity
import com.jin.ktafds.math.MathActivity
import java.lang.reflect.Type

class MainViewModel : ViewModel() {
    val learnChinese = "汉字"
    val learnMath = "数字"
    val learnEnglish = "英文"
    var callback: Callback? = null

    fun goLearn(learnType: Int) {
        callback?.chooseLearnType(learnType)
    }

    interface Callback {
        fun chooseLearnType(type: Int)
    }
}