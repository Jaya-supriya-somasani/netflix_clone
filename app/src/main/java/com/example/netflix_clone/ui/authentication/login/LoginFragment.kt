package com.example.netflix_clone.ui.authentication.login

import androidx.lifecycle.LifecycleOwner
import androidx.navigation.fragment.findNavController
import com.example.base.BaseFragment
import com.example.base.utils.collect
import com.example.base.utils.safeLaunchWhenResumed
import com.example.netflix_clone.R
import com.example.netflix_clone.databinding.FragmentLoginBinding

class LoginFragment : BaseFragment<FragmentLoginBinding, LoginViewModel>() {
    override fun initObservers(viewLifecycleOwner: LifecycleOwner) {
        safeLaunchWhenResumed {
            viewModel.signUpEvent.collect {
                val action = LoginFragmentDirections.actionLoginFragmentToSignUpFragment()
                findNavController().navigate(action)
            }
        }
        safeLaunchWhenResumed {
            viewModel.credentialsValidateEvent.collect {
                validateCredentials()
            }
        }
    }

    override fun setUp() {
        dataBinding.viewModel = viewModel
        dataBinding.arrowBackIcon.setOnClickListener {
            findNavController().popBackStack()
        }
    }

    private fun validateCredentials() {
        if (!viewModel.emailOrPhoneNumberFlow.value.contains("@gmail.com")) {
            dataBinding.emailNumberTextLayout.error = "Enter correct email or phone number"
            dataBinding.passwordTextLayout.error = ""
        } else if (viewModel.passwordFlow.value.isBlank() || viewModel.passwordFlow.value.length >= 4) {
            dataBinding.passwordTextLayout.error =
                "Your password must contain between 4 to 60 characters"
            dataBinding.emailNumberTextLayout.error = ""

        } else {
            viewModel.signInUser()
        }
    }

    override val TAG = "LoginFragment"
    override fun getLayoutResource() = R.layout.fragment_login

}