package com.example.netflix_clone.ui.authentication.newAccount

import androidx.lifecycle.LifecycleOwner
import androidx.navigation.fragment.findNavController
import com.example.base.BaseFragment
import com.example.base.utils.collect
import com.example.base.utils.safeLaunchWhenResumed
import com.example.netflix_clone.R
import com.example.netflix_clone.databinding.FragmentCreateAccountBinding

class CreateAccountFragment : BaseFragment<FragmentCreateAccountBinding, CreateAccountViewModel>() {
    override val TAG = "CreateAccountFragment"

    override fun getLayoutResource() = R.layout.fragment_create_account

    override fun initObservers(viewLifecycleOwner: LifecycleOwner) {
        safeLaunchWhenResumed {
            viewModel.loginEvent.collect {
                val action =
                    CreateAccountFragmentDirections.actionCreateAccountFragmentToLoginFragment()
                findNavController().navigate(action)
            }
        }

        safeLaunchWhenResumed {
            viewModel.helpEvent.collect {

            }
        }
    }

    override fun setUp() {
        dataBinding.viewModel = viewModel
    }
}