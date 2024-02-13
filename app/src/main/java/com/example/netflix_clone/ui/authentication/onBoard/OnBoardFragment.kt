package com.example.netflix_clone.ui.authentication.onBoard

import androidx.lifecycle.LifecycleOwner
import com.example.base.BaseFragment
import com.example.netflix_clone.R
import com.example.netflix_clone.databinding.FragmentOnBoardBinding

class OnBoardFragment : BaseFragment<FragmentOnBoardBinding, OnBoardViewModel>() {
    override val TAG = "OnBoardFragment"

    override fun getLayoutResource() = R.layout.fragment_on_board

    override fun initObservers(viewLifecycleOwner: LifecycleOwner) {
    }

    override fun setUp() {
    }
}