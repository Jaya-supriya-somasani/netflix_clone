package com.example.netflix_clone.ui.authentication.login.di

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.base.viewmodel.ViewModelKey
import com.example.netflix_clone.ui.authentication.login.LoginFragment
import com.example.netflix_clone.ui.authentication.login.LoginViewModel
import dagger.Module
import dagger.Provides
import dagger.android.ContributesAndroidInjector
import dagger.multibindings.IntoMap

@Module
abstract class LoginModule {

    @ContributesAndroidInjector(modules = [ProvideFragmentDependencies::class])
    internal abstract fun providesFragmentFactory(): LoginFragment


    @Module
    internal class ProvideFragmentDependencies {
        @Provides
        @IntoMap
        @ViewModelKey(LoginViewModel::class)
        internal fun bindViewModel(): ViewModel {
            return LoginViewModel()
        }

        @Provides
        internal fun providesViewModule(target: LoginFragment, factory: ViewModelProvider.Factory) =
            ViewModelProvider(target, factory)[LoginViewModel::class.java]
    }
}