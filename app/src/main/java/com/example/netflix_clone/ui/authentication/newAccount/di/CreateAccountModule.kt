package com.example.netflix_clone.ui.authentication.newAccount.di

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.base.viewmodel.ViewModelKey
import com.example.netflix_clone.ui.authentication.newAccount.CreateAccountFragment
import com.example.netflix_clone.ui.authentication.newAccount.CreateAccountViewModel
import dagger.Module
import dagger.Provides
import dagger.android.ContributesAndroidInjector
import dagger.multibindings.IntoMap

@Module
abstract class CreateAccountModule {

    @ContributesAndroidInjector(modules = [ProvidesFragmentDependencies::class])
    internal abstract fun providesFragmentFactory(): CreateAccountFragment

    @Module
    internal class ProvidesFragmentDependencies {

        @Provides
        @IntoMap
        @ViewModelKey(CreateAccountViewModel::class)
        internal fun bindViewModel(): ViewModel {
            return CreateAccountViewModel()
        }

        @Provides
        internal fun providesViewModule(
            target: CreateAccountFragment,
            factory: ViewModelProvider.Factory
        ) = ViewModelProvider(target, factory)[CreateAccountViewModel::class.java]
    }
}