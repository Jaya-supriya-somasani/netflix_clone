package com.example.netflix_clone.ui.authentication.splash.di

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.base.viewmodel.ViewModelKey
import com.example.netflix_clone.ui.authentication.splash.SplashActivity
import com.example.netflix_clone.ui.authentication.splash.SplashViewModel
import dagger.Module
import dagger.Provides
import dagger.multibindings.IntoMap

@Module(includes = [SplashActivityModule.ProvidesActivityViewModel::class])
class SplashActivityModule {

    @Module
    internal class ProvidesActivityViewModel {


    }

    @Provides
    @IntoMap
    @ViewModelKey(SplashViewModel::class)
    internal fun providesViewModel(): ViewModel {
        return SplashViewModel()
    }

    @Provides
    internal fun providesActivityViewModelProvider(
        factory: ViewModelProvider.Factory,
        target: SplashActivity
    ): SplashViewModel {
        return ViewModelProvider(target, factory)[SplashViewModel::class.java]
    }

}