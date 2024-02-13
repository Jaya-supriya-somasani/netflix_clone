package com.example.netflix_clone.ui.authentication.splash

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
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