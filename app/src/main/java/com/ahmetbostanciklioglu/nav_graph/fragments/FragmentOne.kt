package com.ahmetbostanciklioglu.nav_graph.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.ahmetbostanciklioglu.nav_graph.R
import com.ahmetbostanciklioglu.nav_graph.databinding.FragmentOneBinding


class FragmentOne : Fragment() {


    private lateinit var binding: FragmentOneBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        //val view: View = inflater.inflate(R.layout.fragment_one, container, false)

        binding = FragmentOneBinding.inflate(layoutInflater)
        binding.btnNavigateFragmentTwo.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_fragmentOne_to_fragmentTwo)
        }
        return binding.root
    }

}