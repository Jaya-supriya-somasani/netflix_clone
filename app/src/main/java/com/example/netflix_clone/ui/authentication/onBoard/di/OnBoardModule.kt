package com.example.netflix_clone.ui.authentication.onBoard.di

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.base.viewmodel.ViewModelKey
import com.example.netflix_clone.ui.authentication.onBoard.OnBoardFragment
import com.example.netflix_clone.ui.authentication.onBoard.OnBoardViewModel
import dagger.Module
import dagger.Provides
import dagger.android.ContributesAndroidInjector
import dagger.multibindings.IntoMap

@Module
abstract class OnBoardModule {

    @ContributesAndroidInjector(modules = [ProvidesDependencies::class])
    internal abstract fun providesFragmentDependencies(): OnBoardFragment

    @Module
    internal class ProvidesDependencies {

        @Provides
        @IntoMap
        @ViewModelKey(OnBoardViewModel::class)
        internal fun bindViewModel(): ViewModel {
            return OnBoardViewModel()
        }

        @Provides
        internal fun providesViewModule(
            target: OnBoardFragment,
            factory: ViewModelProvider.Factory
        ) = ViewModelProvider(target, factory)[OnBoardViewModel::class.java]
    }
}