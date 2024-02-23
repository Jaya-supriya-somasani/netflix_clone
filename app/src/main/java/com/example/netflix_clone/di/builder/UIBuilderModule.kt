package com.example.netflix_clone.di.builder

import androidx.lifecycle.ViewModelProvider
import com.example.netflix_clone.ui.authentication.AuthenticationActivity
import com.example.netflix_clone.ui.authentication.AuthenticationActivityModule
import com.example.netflix_clone.ui.authentication.login.di.LoginModule
import com.example.netflix_clone.ui.authentication.signup.di.SignUpModule
import com.example.netflix_clone.ui.authentication.splash.SplashActivity
import com.example.netflix_clone.ui.authentication.onBoard.di.OnBoardModule
import com.example.netflix_clone.ui.authentication.splash.di.SplashActivityModule
import com.example.netflix_clone.ui.home.di.HomeModule
import com.example.netflix_clone.ui.main.MainActivity
import com.example.netflix_clone.ui.main.MainActivityModule
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
        fun provideFactory(): ViewModelProvider.Factory =
            ViewModelProvider.AndroidViewModelFactory()
    }

    @ContributesAndroidInjector(
        modules = [
            MainActivityModule::class,
            HomeModule::class,
        ]
    )
    internal abstract fun mainActivity(): MainActivity

    @ContributesAndroidInjector(
        modules = [
            SplashActivityModule::class,

        ]
    )
    internal abstract fun splashActivity(): SplashActivity

    @ContributesAndroidInjector(
        modules = [
            AuthenticationActivityModule::class,
            LoginModule::class,
            SignUpModule::class,
            OnBoardModule::class,]
    )
    internal abstract fun authenticationActivity(): AuthenticationActivity
}