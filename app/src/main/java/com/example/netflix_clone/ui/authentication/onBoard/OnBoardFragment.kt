package com.example.netflix_clone.ui.authentication.onBoard

import android.util.Log
import androidx.lifecycle.LifecycleOwner
import androidx.navigation.fragment.findNavController
import com.example.base.BaseFragment
import com.example.base.utils.collect
import com.example.base.utils.safeLaunchWhenResumed
import com.example.netflix_clone.R
import com.example.netflix_clone.databinding.FragmentOnBoardBinding
import com.example.netflix_clone.ui.authentication.onBoard.adapter.OnBoardAdapter
import com.example.netflix_clone.ui.authentication.onBoard.model.OnBoardItem

class OnBoardFragment : BaseFragment<FragmentOnBoardBinding, OnBoardViewModel>() {
    override val TAG = "OnBoardFragment"


    override fun getLayoutResource() = R.layout.fragment_on_board
    val items = listOf(
        OnBoardItem(
            R.drawable.intro_pic,
            "Unlimited\nentertainment,\none low price",
            "Everything on Netflix, starting at just\n $149"
        ),
        OnBoardItem(
            R.drawable.intro_pic,
            "Download and\nwatch offline",
            "Always have something to watch"
        ),
        OnBoardItem(
            R.drawable.intro_pic,
            "Cancel online\nanytime",
            "Join today, no reason to wait"
        ),
        OnBoardItem(
            R.drawable.intro_pic,
            "Watch\neverywhere",
            "Stream on your phone, tablet, laptop, Tv\n and more."
        ),
    )

    private val adapter by lazy {
        OnBoardAdapter(items)
    }

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
        Log.d(TAG, "Login-event-clicked")
        val action = OnBoardFragmentDirections.actionOnBoardFragmentToLoginFragment()
        findNavController().navigate(action)
    }

    private fun navigateToSignUpScreen() {
        Log.d(TAG, "SignUp-event-clicked")
        val action = OnBoardFragmentDirections.actionOnBoardFragmentToSignUpFragment()
        findNavController().navigate(action)
    }

    override fun setUp() {
        dataBinding.viewModel = viewModel
        dataBinding.viewPager.adapter = adapter
    }
}