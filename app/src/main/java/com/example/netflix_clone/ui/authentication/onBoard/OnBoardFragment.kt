package com.example.netflix_clone.ui.authentication.onBoard

import android.util.Log
import androidx.lifecycle.LifecycleOwner
import androidx.navigation.fragment.findNavController
import com.example.base.BaseFragment
import com.example.base.utils.collect
import com.example.base.utils.safeLaunch
import com.example.base.utils.safeLaunchWhenResumed
import com.example.netflix_clone.R
import com.example.netflix_clone.databinding.FragmentOnBoardBinding

class OnBoardFragment : BaseFragment<FragmentOnBoardBinding, OnBoardViewModel>() {
    override val TAG = "OnBoardFragment"

    override fun getLayoutResource() = R.layout.fragment_on_board

    override fun initObservers(viewLifecycleOwner: LifecycleOwner) {
        safeLaunchWhenResumed {
            viewModel.loginEventClick.collect {
                navigateToLoginScreen()
            }
        }
        safeLaunchWhenResumed {
            viewModel.signUpEventClick.collect {
                navigateToSignUpScreen()
            }
        }
    }

    private fun navigateToLoginScreen() {
        Log.d(TAG,"Login-event-clicked")
        val action = OnBoardFragmentDirections.actionOnBoardFragmentToLoginFragment()
        findNavController().navigate(action)
    }
    private fun navigateToSignUpScreen() {
        Log.d(TAG,"SignUp-event-clicked")
        val action = OnBoardFragmentDirections.actionOnBoardFragmentToSignUpFragment()
        findNavController().navigate(action)
    }

    override fun setUp() {
        dataBinding.viewModel=viewModel

    }
}