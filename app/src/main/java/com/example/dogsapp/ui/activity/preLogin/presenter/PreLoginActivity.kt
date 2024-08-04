package com.example.dogsapp.ui.activity.preLogin.presenter

import android.content.Intent
import android.os.Bundle

import androidx.appcompat.app.AppCompatActivity
import com.example.dogsapp.databinding.ActivityPreLoginBinding
import com.example.dogsapp.ui.activity.login.LoginActivity
import com.example.dogsapp.ui.activity.home.presenter.HomeContainerActivity
import com.example.dogsapp.ui.activity.register.presenter.RegisterActivity

class PreLoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityPreLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPreLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        navigation()

    }


    private fun navigation() {
        binding.cvRegister.setOnClickListener {
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }
        binding.cvInvited.setOnClickListener {
            val intent = Intent(this, HomeContainerActivity::class.java)
            startActivity(intent)
        }
        binding.cvLogin.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }

    }


}

