package com.example.netflix_clone.ui.home.di

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.base.viewmodel.ViewModelKey
import com.example.netflix_clone.ui.home.HomeFragment
import com.example.netflix_clone.ui.home.HomeViewModel
import dagger.Module
import dagger.Provides
import dagger.android.ContributesAndroidInjector
import dagger.multibindings.IntoMap

@Module
abstract class HomeModule {

    @ContributesAndroidInjector(modules = [ProvideFragmentDependencies::class])
    internal abstract fun providesFragmentFactory(): HomeFragment

    @Module
    internal class ProvideFragmentDependencies {

        @Provides
        @IntoMap
        @ViewModelKey(HomeViewModel::class)
        internal fun bindViewModel(): ViewModel {
            return HomeViewModel()
        }

        @Provides
        internal fun providesViewModule(
            target: HomeFragment,
            factory: ViewModelProvider.Factory
        ) = ViewModelProvider(target, factory = factory)[HomeViewModel::class.java]

    }

}