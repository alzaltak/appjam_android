package com.aljaldak.culmix.feature.sethome.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.MutableLiveData
import com.aljaldak.culmix.R
import com.aljaldak.culmix.databinding.ActivitySetHomeBinding

class SetHomeActivity : AppCompatActivity() {

    private val statusFlag = MutableLiveData(0)

    var isTurnOfButtonSelect = false

    private val binding: ActivitySetHomeBinding by lazy {
        DataBindingUtil.setContentView(
            this,
            R.layout.activity_set_home,
        )
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding
        initAcceptButton()
        observeStatus()
    }

    private fun initAcceptButton() {
        binding.imgSetHomePrimary.setOnClickListener {
            if (!isTurnOfButtonSelect) {
                statusFlag.value = statusFlag.value!! + 1
                print("HI")
                isTurnOfButtonSelect = true
            }
        }

        binding.btnSetHomeAccept.setOnClickListener {
            if (isTurnOfButtonSelect) {
                statusFlag.value = statusFlag.value!! + 1
                isTurnOfButtonSelect = false
            }
        }
    }

    private fun observeStatus() {
        statusFlag.observe(
            this,
        ) {
            with(binding) {
                when (it) {
                    1 -> {
                        imgSetHomePrimary.setImageResource(
                            R.drawable.img_set_home_country_selected,
                        )
                        btnSetHomeAccept.setImageResource(
                            R.drawable.btn_set_home_accept_abled,
                        )
                    }
                    2 -> {
                        imgSetHomePrimary.setImageResource(
                            R.drawable.img_set_home_state_unselected,
                        )
                        btnSetHomeAccept.setImageResource(
                            R.drawable.btn_set_home_accept_disabled,
                        )
                    }
                    3 -> {
                        imgSetHomePrimary.setImageResource(
                            R.drawable.img_set_home_state_selected,
                        )
                        btnSetHomeAccept.setImageResource(
                            R.drawable.btn_set_home_accept_abled,
                        )
                    }
                    4 -> {
                        finish()
                    }
                }
            }
        }
    }
}