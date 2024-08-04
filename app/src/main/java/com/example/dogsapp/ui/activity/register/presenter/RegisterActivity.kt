package com.example.dogsapp.ui.activity.register.presenter

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.dogsapp.databinding.ActivityRegisterBinding
import com.example.dogsapp.ui.activity.preLogin.presenter.PreLoginActivity

class RegisterActivity : AppCompatActivity() {
    private lateinit var binding: ActivityRegisterBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)

        navigation()

    }
    private fun navigation(){
        binding.backButton.setOnClickListener {
            val intent = Intent(this, PreLoginActivity::class.java)
            startActivity(intent)
        }
    }
}