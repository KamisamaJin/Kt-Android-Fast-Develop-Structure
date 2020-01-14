package com.jin.ktafds

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.jin.ktafds.databinding.ActivityMainBinding
import com.jin.ktafds.viewmodel.ViewModelDemo
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val binding : ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.apply {
            data = ViewModelDemo().apply {
                welcomeText.set("hello")
            }
        }
    }




}
