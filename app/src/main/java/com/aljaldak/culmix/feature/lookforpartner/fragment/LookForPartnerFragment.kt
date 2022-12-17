package com.aljaldak.culmix.feature.lookforpartner.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.aljaldak.culmix.databinding.FragmentLookForPartnerBinding

class LookForPartnerFragment : Fragment() {

    private lateinit var binding: FragmentLookForPartnerBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        binding = FragmentLookForPartnerBinding.inflate(
            inflater,
            container,
            false,
        )
        return binding.root
    }
}