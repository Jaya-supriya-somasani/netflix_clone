package com.example.netflix_clone.ui.authentication


import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.base.viewmodel.ViewModelKey
import com.example.netflix_clone.ui.main.MainActivity
import com.example.netflix_clone.ui.main.MainActivityModule
import dagger.Module
import dagger.Provides
import dagger.android.ContributesAndroidInjector
import dagger.multibindings.IntoMap

@Module(includes = [AuthenticationActivityModule.ProvidesActivityViewModel::class])
class AuthenticationActivityModule {

    @Module
    internal class ProvidesActivityViewModel {}


    @Provides
    @IntoMap
    @ViewModelKey(AuthenticationViewModel::class)
    internal fun providesActivityViewModel(
    ): ViewModel {
        return AuthenticationViewModel()
    }


    @Provides
    internal fun providesActivityViewModelProvider(
        target: AuthenticationActivity
    ): AuthenticationViewModel {
        return ViewModelProvider(target, ViewModelProvider.AndroidViewModelFactory())[AuthenticationViewModel::class.java]
    }
}