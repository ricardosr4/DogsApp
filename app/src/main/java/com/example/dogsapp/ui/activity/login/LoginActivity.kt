package com.example.dogsapp.ui.activity.login

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.dogsapp.R
import com.example.dogsapp.databinding.ActivityLoginBinding
import com.example.dogsapp.ui.activity.preLogin.presenter.PreLoginActivity
import com.example.dogsapp.ui.activity.register.RegisterActivity

class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        navPrelogin()
        }

        private fun navPrelogin(){
            binding.backButton.setOnClickListener {
                val intent = Intent(this, PreLoginActivity::class.java)
                startActivity(intent)
            }
        }
}