package com.example.medica

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.RequiresApi
import com.example.medica.databinding.ActivitySignUpBinding

class SignUpActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySignUpBinding
    @RequiresApi(Build.VERSION_CODES.M)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignUpBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var emailEtSelect = binding.emailEt
        emailEtSelect.setOnFocusChangeListener { v, hasFocus ->
            if (hasFocus == true){
                binding.emailEt.setBackgroundResource(R.drawable.create_account_plantext_sellect_border_radius)
                binding.emailEt.setCompoundDrawablesWithIntrinsicBounds(R.drawable.select_message, 0, 0, 0);

            }else{
                binding.emailEt.setBackgroundResource(R.drawable.create_account_plantext_border_radius)
                binding.emailEt.setCompoundDrawablesWithIntrinsicBounds(R.drawable.message, 0, 0, 0);
            }
        }
        var passwordEtSelect = binding.passwordEt
        passwordEtSelect.setOnFocusChangeListener{v , hasFocus ->
            if (hasFocus == true) {
                binding.passwordEt.setBackgroundResource(R.drawable.create_account_plantext_sellect_border_radius)
                binding.passwordEt.setCompoundDrawablesWithIntrinsicBounds(R.drawable.select_lock, 0, R.drawable.select_group, 0);
            }else{
                binding.passwordEt.setBackgroundResource(R.drawable.create_account_plantext_border_radius)
                binding.passwordEt.setCompoundDrawablesWithIntrinsicBounds(R.drawable.lock, 0, R.drawable.group, 0);
            }
        }
        binding.signUpBtn.setOnClickListener {
            Intent(this, SignInActivity::class.java).apply {
                startActivity(this)
            }
        }
    }
}




//      val emailEt = binding.emailEt
//
//emailEt.setOnFocusChangeListener { v, hasFocus ->
//    if (hasFocus) {
//        // Edit Textga fokus qilinganda orqa fonni o'zgartiring
//        emailEt.setBackgroundResource(R.drawable.create_account_plaintext_select_border_radius)
//    } else {
//        // Edit Textdan fokus olib tashlanganda orqa fonni qaytarish
//        emailEt.setBackgroundResource(R.drawable.create_account_plaintext_default_border_radius)
//    }
//}
