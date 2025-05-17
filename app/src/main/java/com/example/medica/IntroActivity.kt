package com.example.medica

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.medica.databinding.ActivityIntroBinding

class IntroActivity : AppCompatActivity() {
    private lateinit var binding: ActivityIntroBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityIntroBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var int = 0

        binding.nextBtn.setOnClickListener {
            int = int + 1
            if (int == 1){
                supportFragmentManager.apply {
                    beginTransaction().replace(R.id.containerView,IntroFragmentTwo()).commit()
                }
            }
            if (int == 2){
                supportFragmentManager.apply {
                    beginTransaction().replace(R.id.containerView,IntroFragmentTree()).commit()
                    binding.nextBtn.text = "Next"
                }
            }
            if (int == 3){
                Intent(this,LetsyouinActivity::class.java).apply {
                    startActivity(this)
                    finish()
                }
            }
        }
    }
}