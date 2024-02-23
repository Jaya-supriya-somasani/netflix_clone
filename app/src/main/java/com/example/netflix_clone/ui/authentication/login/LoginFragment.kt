package com.example.netflix_clone.ui.authentication.login

import androidx.lifecycle.LifecycleOwner
import androidx.navigation.fragment.findNavController
import com.example.base.BaseFragment
import com.example.netflix_clone.R
import com.example.netflix_clone.databinding.FragmentLoginBinding

class LoginFragment : BaseFragment<FragmentLoginBinding, LoginViewModel>() {
    override fun initObservers(viewLifecycleOwner: LifecycleOwner) {
    }

    override fun setUp() {
        dataBinding.viewModel = viewModel
        dataBinding.arrowBackIcon.setOnClickListener {
            findNavController().popBackStack()
        }
    }

    override val TAG = "LoginFragment"
    override fun getLayoutResource() = R.layout.fragment_login

}