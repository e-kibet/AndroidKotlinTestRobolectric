package com.example.androidkotlintestrobolectric

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.androidkotlintestrobolectric.databinding.ActivityWelcomeBinding

class WelcomeActivity : AppCompatActivity() {
    lateinit var binding: ActivityWelcomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_welcome)

        binding.login.setOnClickListener {
            val intent = Intent(this@WelcomeActivity,MainActivity::class.java)
            startActivity(intent)
        }
    }
}