package com.example.medica

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.animation.AnimationUtils
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.medica.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        enableEdgeToEdge()
        setContentView(binding.root)

        binding.spin.startAnimation(AnimationUtils.loadAnimation(this, R.anim.spin_anim))

        val handler = Handler()
        val delayInMillis = 5000

        handler.postDelayed({
            Intent(this, WelcomeActivity::class.java).apply {
                startActivity(this)
                finish()
            }
        }, delayInMillis.toLong())
    }
}