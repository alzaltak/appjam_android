package com.aljaldak.culmix.root

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.aljaldak.culmix.R
import com.aljaldak.culmix.databinding.ActivityMainBinding
import com.aljaldak.culmix.feature.chatrequest.fragment.ChatRequestListFragment
import com.aljaldak.culmix.feature.lookforpartner.fragment.LookForPartnerFragment
import com.aljaldak.culmix.feature.mypage.fragment.MyPageFragment

class MainActivity : AppCompatActivity() {

    val requestFragment by lazy {
        ChatRequestListFragment()
    }

    val lookForPartnerFragment by lazy {
        LookForPartnerFragment()
    }

    val myPageFragment by lazy {
        MyPageFragment()
    }

    private val binding: ActivityMainBinding by lazy {
        DataBindingUtil.setContentView(
            this,
            R.layout.activity_main,
        )
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        with(binding.bnMain) {
            setOnItemSelectedListener {
                when (it.itemId) {
                    R.id.item_menu_request -> {
                        changeFragment(requestFragment)
                        return@setOnItemSelectedListener true
                    }
                    R.id.item_menu_look_for_partner -> {
                        changeFragment(lookForPartnerFragment)
                        return@setOnItemSelectedListener true
                    }
                    else -> {
                        changeFragment(myPageFragment)
                        return@setOnItemSelectedListener true
                    }
                }
            }
            selectedItemId = R.id.item_menu_request
        }

    }

    private fun changeFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().replace(R.id.container_main, fragment)
            .commitAllowingStateLoss()
    }
}
