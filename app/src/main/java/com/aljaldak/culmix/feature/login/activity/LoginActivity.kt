package com.aljaldak.culmix.feature.login.activity

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.aljaldak.culmix.R
import com.aljaldak.culmix.data.LoginRequest
import com.aljaldak.culmix.databinding.ActivityLoginBinding
import com.aljaldak.culmix.root.MainActivity
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class LoginActivity : AppCompatActivity() {

    private val viewModel by viewModels<LoginViewModel>()

    private val binding: ActivityLoginBinding by lazy {
        DataBindingUtil.setContentView(
            this,
            R.layout.activity_login,
        )
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding.btnLoginLogin.setOnClickListener {
            if (binding.etLoginId.text!!.isNotBlank() && binding.etLoginPassword.text!!.isNotBlank()) {
                viewModel.login(
                    LoginRequest(
                        binding.etLoginId.text.toString(),
                        binding.etLoginPassword.text.toString(),
                    )
                )
            } else {
                Toast.makeText(this, "형식을 확인해 주세요", Toast.LENGTH_SHORT).show()
            }
        }
        viewModel.loginResponse.observe(
            this,
        ) {
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