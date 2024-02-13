package com.example.netflix_clone.ui.authentication.splash

import android.animation.Animator
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
        startAnimation()
    }

    private fun startAnimation() {
        val animationView = dataBinding.splashAnimation
        animationView.setAnimation("splash_animation.json")
        animationView.playAnimation()

        animationView.addAnimatorListener(object : Animator.AnimatorListener {
            override fun onAnimationStart(animation: Animator) {
            }

            override fun onAnimationEnd(animation: Animator) {
                navigateToScreens()
            }

            override fun onAnimationCancel(animation: Animator) {
            }

            override fun onAnimationRepeat(animation: Animator) {
            }

        })
    }

    private fun navigateToScreens() {
        safeLaunch {
            val navigationIntent = if (viewModel.isLoggedIn())
                Intent(this@SplashActivity, MainActivity::class.java)
            else Intent(
                this@SplashActivity,
                AuthenticationActivity::class.java
            )
            startActivity(navigationIntent)
            finish()
        }
    }

    override fun initObservers() {
    }

}