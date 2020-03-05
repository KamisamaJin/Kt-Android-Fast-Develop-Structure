package com.jin.ktafds

import android.content.Intent
import android.os.Bundle
import android.os.CountDownTimer
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.jin.ktafds.databinding.ActivitySplashBinding
import com.jin.ktafds.viewmodel.SplashViewModel

/**
 * 开屏页面
 */
class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        //使用data binding
        val binding: ActivitySplashBinding =
            DataBindingUtil.setContentView(this, R.layout.activity_splash)
        binding.apply {
            data = SplashViewModel().apply {
                this.welcomeText.set("愿每个孩子都是小天才")
            }
        }
        //显示两秒, 跳转
        val countDownTimer = object : CountDownTimer(2000, 1000) {
            override fun onFinish() {
                startActivity(Intent(this@SplashActivity, MainActivity::class.java))
                finish()
            }

            override fun onTick(millisUntilFinished: Long) {

            }
        }.start()
    }
}
