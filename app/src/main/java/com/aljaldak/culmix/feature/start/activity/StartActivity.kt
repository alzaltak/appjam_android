package com.aljaldak.culmix.feature.start.activity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.aljaldak.culmix.R
import com.aljaldak.culmix.databinding.ActivityStartBinding
import com.aljaldak.culmix.feature.login.activity.LoginActivity
import com.aljaldak.culmix.feature.register.RegisterActivity

class StartActivity : AppCompatActivity() {

    private val binding: ActivityStartBinding by lazy {
        DataBindingUtil.setContentView(
            this,
            R.layout.activity_start,
        )
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding.btnStartLogin.setOnClickListener {
            startActivity(
                Intent(
                    this,
                    LoginActivity::class.java,
                )
            )
        }
        binding.btnStartRegister.setOnClickListener {
            startActivity(
                Intent(
                    this,
                    RegisterActivity::class.java,
                )
            )
        }
    }
}
