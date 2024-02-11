package com.example.netflix_clone.ui.authentication.splash

import com.example.base.BaseActivity
import com.example.netflix_clone.R
import com.example.netflix_clone.databinding.ActivitySplashBinding

class SplashActivity : BaseActivity<ActivitySplashBinding, SplashViewModel>() {
    override val TAG = "SplashActivity"

    override fun getLayoutResource() = R.layout.activity_splash

    override fun setUp() {
        navigateToScreens()
    }

    private fun navigateToScreens(){

    }
    override fun initObservers() {
    }

}