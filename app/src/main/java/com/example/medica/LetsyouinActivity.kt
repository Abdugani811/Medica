package com.example.medica

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.medica.databinding.ActivityLetsyouinBinding

class LetsyouinActivity : AppCompatActivity() {
    private lateinit var binding :ActivityLetsyouinBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLetsyouinBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button2.setOnClickListener {
            Intent(this,SignInActivity::class.java).apply {
                startActivity(this)
            }
        }
        binding.signUpBtn.setOnClickListener {
            Intent(this,SignUpActivity::class.java).apply {
                startActivity(this)
            }
        }
    }
}