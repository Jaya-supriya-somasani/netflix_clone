package com.example.netflix_clone.ui.authentication.login

import androidx.lifecycle.LifecycleOwner
import com.example.base.BaseFragment
import com.example.netflix_clone.R
import com.example.netflix_clone.databinding.FragmentLoginBinding

class LoginFragment : BaseFragment<FragmentLoginBinding, LoginViewModel>() {
    override fun initObservers(viewLifecycleOwner: LifecycleOwner) {
    }

    override fun setUp() {
        dataBinding.viewModel = viewModel
    }

    override val TAG = "LoginFragment"
    override fun getLayoutResource() = R.layout.fragment_login

}