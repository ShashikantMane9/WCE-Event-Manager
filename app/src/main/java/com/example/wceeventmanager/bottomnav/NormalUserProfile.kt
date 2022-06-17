package com.example.wceeventmanager.bottomnav

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.wceeventmanager.R
import com.example.wceeventmanager.databinding.FragmentNormalUserProfileBinding
//import com.example.wceeventmanager.databinding.FragmentRegistrationFormBinding


class NormalUserProfile : Fragment() {


    private var mbinding: FragmentNormalUserProfileBinding?=null

    private val binding get()= mbinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        mbinding= FragmentNormalUserProfileBinding.inflate(inflater,container,false)

        val name = binding?.nametv.toString()
        val email = binding?.emailtv.toString()

        return mbinding!!.root
    }

}

