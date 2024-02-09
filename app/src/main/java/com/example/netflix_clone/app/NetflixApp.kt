package com.example.netflix_clone.app

import com.example.base.app.BaseApp
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication

class NetflixApp : BaseApp() {
    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
    return DaggerAppComponent.builder()
        .application(this)
        .build()
    }
}