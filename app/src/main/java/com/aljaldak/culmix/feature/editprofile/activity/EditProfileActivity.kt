package com.aljaldak.culmix.feature.editprofile.activity

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.aljaldak.culmix.R
import com.aljaldak.culmix.databinding.ActivityEditProfileBinding

class EditProfileActivity : AppCompatActivity() {

    private val binding: ActivityEditProfileBinding by lazy {
        DataBindingUtil.setContentView(
            this,
            R.layout.activity_edit_profile,
        )
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding.btnEditProfileBack.setOnClickListener {
            finish()
        }

        binding.btnEditProfileAccept.setOnClickListener {
            Toast.makeText(this, "변경이 완료되었습니다.", Toast.LENGTH_SHORT).show()
            finish()
        }
    }
}