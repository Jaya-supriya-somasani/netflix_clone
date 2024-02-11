package com.example.netflix_clone.ui.authentication

import com.example.base.BaseActivity
import com.example.netflix_clone.R
import com.example.netflix_clone.databinding.ActivityAuthenticationBinding

class AuthenticationActivity :
    BaseActivity<ActivityAuthenticationBinding, AuthenticationViewModel>() {
    override val TAG = "AuthenticationActivity"
    override fun getLayoutResource() = R.layout.activity_authentication
    override fun setUp() {
    }

    override fun initObservers() {
    }
}