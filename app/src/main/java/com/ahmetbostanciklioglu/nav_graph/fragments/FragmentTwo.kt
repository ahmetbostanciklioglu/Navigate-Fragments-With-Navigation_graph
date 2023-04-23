package com.ahmetbostanciklioglu.nav_graph.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.ahmetbostanciklioglu.nav_graph.R
import com.ahmetbostanciklioglu.nav_graph.databinding.FragmentTwoBinding


class FragmentTwo : Fragment() {

    private lateinit var binding: FragmentTwoBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentTwoBinding.inflate(layoutInflater)

        binding.btnNavigateFragmentOne.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_fragmentTwo_to_fragmentOne)
        }

        return binding.root
    }

}