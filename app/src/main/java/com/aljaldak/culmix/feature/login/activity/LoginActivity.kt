package com.aljaldak.culmix.feature.login.activity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.aljaldak.culmix.R
import com.aljaldak.culmix.databinding.ActivityLoginBinding
import com.aljaldak.culmix.root.MainActivity

class LoginActivity : AppCompatActivity() {

    private val binding: ActivityLoginBinding by lazy {
        DataBindingUtil.setContentView(
            this,
            R.layout.activity_login,
        )
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding.btnLoginLogin.setOnClickListener {
            startActivity(
                Intent(
                    this,
                    MainActivity::class.java,
                )
            )
            finish()
        }
    }
}