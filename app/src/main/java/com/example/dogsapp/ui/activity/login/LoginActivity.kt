package com.example.dogsapp.ui.activity.login

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.dogsapp.databinding.ActivityLoginBinding
import com.example.dogsapp.ui.activity.preLogin.presenter.PreLoginActivity

class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        navPreLogin()
        }

        private fun navPreLogin(){
            binding.backButton.setOnClickListener {
                val intent = Intent(this, PreLoginActivity::class.java)
                startActivity(intent)
            }
        }
}