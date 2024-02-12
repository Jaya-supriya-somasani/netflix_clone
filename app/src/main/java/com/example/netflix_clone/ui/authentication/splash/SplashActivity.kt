package com.example.netflix_clone.ui.authentication.splash

import android.content.Intent
import com.example.base.BaseActivity
import com.example.base.utils.safeLaunch
import com.example.netflix_clone.R
import com.example.netflix_clone.databinding.ActivitySplashBinding
import com.example.netflix_clone.ui.authentication.AuthenticationActivity
import com.example.netflix_clone.ui.main.MainActivity


class SplashActivity : BaseActivity<ActivitySplashBinding, SplashViewModel>() {
    override val TAG = "SplashActivity"

    override fun getLayoutResource() = R.layout.activity_splash

    override fun setUp() {
        navigateToScreens()
    }

    private fun navigateToScreens() {
        safeLaunch {
            val navigationIntent = when {
                viewModel.isLoggedIn() -> {
                    Intent(this@SplashActivity, MainActivity::class.java)
                }

                else -> {
                    Intent(this@SplashActivity, AuthenticationActivity::class.java)
                }
            }
            startActivity(navigationIntent)
            finish()
        }
    }

    override fun initObservers() {
    }

}