package com.aljaldak.culmix.feature.homeinspection.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.aljaldak.culmix.R
import com.aljaldak.culmix.databinding.ActivityHomeInspectionBinding

class HomeInspectionActivity : AppCompatActivity() {

    private val binding: ActivityHomeInspectionBinding by lazy {
        DataBindingUtil.setContentView(
            this,
            R.layout.activity_home_inspection,
        )
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding
    }
}