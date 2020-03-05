package com.jin.ktafds

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.commit
import com.jin.ktafds.chinese.ChineseActivity
import com.jin.ktafds.databinding.ActivityMainBinding
import com.jin.ktafds.english.EnglishActivity
import com.jin.ktafds.math.MathActivity
import com.jin.ktafds.viewmodel.MainViewModel


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val binding: ActivityMainBinding =
            DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.apply {
            data = MainViewModel().apply {
                callback = object : MainViewModel.Callback {
                    override fun chooseLearnType(type: Int) {
                        startActivity(
                            Intent(
                                this@MainActivity, when (type) {
                                    0 -> ChineseActivity::class.java
                                    1 -> MathActivity::class.java
                                    2 -> EnglishActivity::class.java
                                    else -> EnglishActivity::class.java
                                }
                            )
                        )
                    }
                }
            }
        }

        supportFragmentManager.commit(true) {
            //addToBackStack()
            //setCustomAnimations()
            //replace()
        }
    }


}
