package com.example.netflix_clone.ui.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.base.BaseActivity
import com.example.netflix_clone.R
import com.example.netflix_clone.databinding.ActivityMainBinding

class MainActivity : BaseActivity<ActivityMainBinding, MainActivityViewModel>() {
    override val TAG = "MainActivity"

    override fun getLayoutResource() = R.layout.activity_main

    override fun setUp() {
    }

    override fun initObservers() {
    }

}