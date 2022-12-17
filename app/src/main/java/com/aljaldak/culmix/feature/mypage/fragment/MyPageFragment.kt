package com.aljaldak.culmix.feature.mypage.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.aljaldak.culmix.databinding.FragmentMypageBinding

class MyPageFragment : Fragment() {

    private lateinit var binding: FragmentMypageBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMypageBinding.inflate(
            inflater,
            container,
            false,
        )
        return binding.root
    }
}