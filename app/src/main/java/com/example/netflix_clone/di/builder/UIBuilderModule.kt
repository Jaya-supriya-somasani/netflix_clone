package com.example.netflix_clone.di.builder

import com.example.netflix_clone.ui.authentication.splash.SplashActivity
import com.example.netflix_clone.ui.authentication.splash.SplashActivityModule
import com.example.netflix_clone.ui.main.MainActivity
import com.example.netflix_clone.ui.main.MainActivityModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class UIBuilderModule {
    @ContributesAndroidInjector(
        modules = [MainActivityModule::class]
    )
    internal abstract fun mainActivity(): MainActivity

    @ContributesAndroidInjector(
        modules = [SplashActivityModule::class]
    )
    internal abstract fun splashActivity(): SplashActivity
}