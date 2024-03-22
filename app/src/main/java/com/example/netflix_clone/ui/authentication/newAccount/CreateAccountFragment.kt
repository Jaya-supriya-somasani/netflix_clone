package com.example.netflix_clone.ui.authentication.newAccount

import androidx.lifecycle.LifecycleOwner
import com.example.base.BaseFragment
import com.example.netflix_clone.R
import com.example.netflix_clone.databinding.FragmentCreateAccountBinding

class CreateAccountFragment : BaseFragment<FragmentCreateAccountBinding, CreateAccountViewModel>() {
    override val TAG = "CreateAccountFragment"

    override fun getLayoutResource() = R.layout.fragment_create_account

    override fun initObservers(viewLifecycleOwner: LifecycleOwner) {
    }

    override fun setUp() {
        dataBinding.viewmodel = viewModel
    }
}