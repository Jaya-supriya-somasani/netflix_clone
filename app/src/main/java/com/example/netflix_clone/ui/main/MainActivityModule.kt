package com.example.netflix_clone.ui.main

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.base.viewmodel.ViewModelKey
import dagger.Module
import dagger.Provides
import dagger.multibindings.IntoMap

@Module(includes = [MainActivityModule.ProvidesActivityViewModel::class])
class MainActivityModule {

    @Module
    internal class ProvidesActivityViewModel{

    }


    @Provides
    @IntoMap
    @ViewModelKey(MainActivityViewModel::class)
    internal fun providesActivityViewModel(): ViewModel {
        return MainActivityViewModel()
    }

    @Provides
    internal fun providesActivityViewModelProvider(
        factory: ViewModelProvider.Factory,
        target: MainActivity
    ): MainActivityViewModel {
        return ViewModelProvider(target, factory)[MainActivityViewModel::class.java]
    }

}