package com.example.netflix_clone.di.builder

import android.view.View
import androidx.lifecycle.ViewModelProvider
import com.example.netflix_clone.ui.authentication.AuthenticationActivity
import com.example.netflix_clone.ui.authentication.AuthenticationActivityModule
import com.example.netflix_clone.ui.authentication.splash.SplashActivity
import com.example.netflix_clone.ui.authentication.splash.SplashActivityModule
import com.example.netflix_clone.ui.main.MainActivity
import com.example.netflix_clone.ui.main.MainActivityModule
import dagger.BindsInstance
import dagger.Module
import dagger.Provides
import dagger.android.ContributesAndroidInjector
import javax.inject.Singleton

@Module(includes = [UIBuilderModule.ProvideFactory::class])
abstract class UIBuilderModule {

//    @BindsInstance
//    abstract fun bindFactory(): ViewModelProvider.Factory

    @Module
    internal class ProvideFactory() {

        @Provides
        @Singleton
        fun provideFactory(): ViewModelProvider.Factory = ViewModelProvider.AndroidViewModelFactory()
    }

    @ContributesAndroidInjector(
        modules = [MainActivityModule::class]
    )
    internal abstract fun mainActivity(): MainActivity

    @ContributesAndroidInjector(
        modules = [SplashActivityModule::class]
    )
    internal abstract fun splashActivity(): SplashActivity

    @ContributesAndroidInjector(
        modules = [
            AuthenticationActivityModule::class]
    )
    internal abstract fun authenticationActivity(): AuthenticationActivity
}