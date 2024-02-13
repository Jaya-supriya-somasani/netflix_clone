package com.example.netflix_clone.ui.authentication.signup.di

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.base.viewmodel.ViewModelKey
import com.example.netflix_clone.ui.authentication.signup.SignUpFragment
import com.example.netflix_clone.ui.authentication.signup.SignUpViewModel
import dagger.Module
import dagger.Provides
import dagger.android.ContributesAndroidInjector
import dagger.multibindings.IntoMap

@Module
abstract class SignUpModule {

    @ContributesAndroidInjector(modules = [ProvidesFragmentDependencies::class])
    internal abstract fun providesFragmentFactory(): SignUpFragment

    @Module
    internal class ProvidesFragmentDependencies {

        @Provides
        @IntoMap
        @ViewModelKey(SignUpViewModel::class)
        internal fun bindViewModel(): ViewModel {
            return SignUpViewModel()
        }

        @Provides
        internal fun providesViewModule(
            target: SignUpFragment,
            factory: ViewModelProvider.Factory
        ) = ViewModelProvider(target, factory)[SignUpViewModel::class.java]
    }
}