package com.example.netflix_clone.ui.authentication.login

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.LifecycleOwner
import androidx.navigation.Navigation
import com.example.base.BaseFragment
import com.example.netflix_clone.R
import com.example.netflix_clone.databinding.FragmentLoginBinding
import dagger.android.AndroidInjector

class LoginFragment : BaseFragment<FragmentLoginBinding, LoginViewModel>() {
    override fun initObservers(viewLifecycleOwner: LifecycleOwner) {
    }

    override fun setUp() {
        dataBinding.viewModel = viewModel
    }

    override val TAG = "LoginFragment"
    override fun getLayoutResource() = R.layout.fragment_login

}