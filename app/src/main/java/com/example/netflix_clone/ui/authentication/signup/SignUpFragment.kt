package com.example.netflix_clone.ui.authentication.signup

import android.util.Log
import androidx.lifecycle.LifecycleOwner
import androidx.navigation.fragment.findNavController
import com.example.base.BaseFragment
import com.example.base.utils.collect
import com.example.base.utils.safeLaunchWhenResumed
import com.example.netflix_clone.R
import com.example.netflix_clone.databinding.FragmentSignUpBinding

class SignUpFragment : BaseFragment<FragmentSignUpBinding, SignUpViewModel>() {
    override val TAG = "SignUpFragment"

    override fun getLayoutResource() = R.layout.fragment_sign_up

    override fun initObservers(viewLifecycleOwner: LifecycleOwner) {
        safeLaunchWhenResumed {
            viewModel.getStartedEvent.collect {
                validateEmail()
            }
        }

    }

    override fun setUp() {
        dataBinding.viewModel = viewModel
        dataBinding.closeIcon.setOnClickListener {
            findNavController().popBackStack()
        }
    }

    private fun validateEmail() {
        Log.d(TAG, "get-started email ${dataBinding.emailEditInp.text}")

        if (dataBinding.emailEditInp.text.isNullOrBlank()) {
            Log.d(TAG, "get-started if")
            dataBinding.emailEditTextLayout.error = "Enter email id"
        } else {
            Log.d(TAG, "get-started  else")
            dataBinding.emailEditTextLayout.error = ""
            val action = SignUpFragmentDirections.actionSignUpFragmentToCreateAccountFragment()
            findNavController().navigate(action)
        }
    }

}