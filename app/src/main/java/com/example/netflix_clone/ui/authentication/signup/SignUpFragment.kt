package com.example.netflix_clone.ui.authentication.signup

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.LifecycleOwner
import androidx.navigation.fragment.findNavController
import com.example.base.BaseFragment
import com.example.netflix_clone.R
import com.example.netflix_clone.databinding.FragmentSignUpBinding

class SignUpFragment : BaseFragment<FragmentSignUpBinding, SignUpViewModel>() {
    override val TAG = "SignUpFragment"

    override fun getLayoutResource() = R.layout.fragment_sign_up

    override fun initObservers(viewLifecycleOwner: LifecycleOwner) {
    }

    override fun setUp() {
        dataBinding.closeIcon.setOnClickListener {
            findNavController().popBackStack()
        }
    }

}