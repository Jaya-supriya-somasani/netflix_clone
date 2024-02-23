package com.example.netflix_clone.ui.home

import androidx.lifecycle.LifecycleOwner
import com.example.base.BaseFragment
import com.example.netflix_clone.R
import com.example.netflix_clone.databinding.FragmentHomeBinding

class HomeFragment : BaseFragment<FragmentHomeBinding, HomeViewModel>() {
    override val TAG = "HomeFragment"

    override fun getLayoutResource() = R.layout.fragment_home

    override fun initObservers(viewLifecycleOwner: LifecycleOwner) {
    }

    override fun setUp() {
    }

}