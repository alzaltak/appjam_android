package com.aljaldak.culmix.feature.chatrequest.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.aljaldak.culmix.databinding.FragmentChatRequestListBinding

class ChatRequestListFragment : Fragment() {

    private lateinit var binding: FragmentChatRequestListBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentChatRequestListBinding.inflate(
            inflater,
            container,
            false,
        )
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.imgChatRequestItem.setOnClickListener {
            it.visibility = View.GONE
        }
    }
}