package com.example.netflix_clone.di.builder

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.base.viewmodel.ViewModelKey
import com.example.netflix_clone.ui.main.MainActivity
import com.example.netflix_clone.ui.main.MainActivityModule
import com.example.netflix_clone.ui.main.MainActivityViewModel
import dagger.Module
import dagger.Provides
import dagger.android.ContributesAndroidInjector
import dagger.multibindings.IntoMap

@Module
abstract class UIBuilderModule {
    @ContributesAndroidInjector(
        modules = [MainActivityModule::class]
    )
    internal abstract fun mainActivity(): MainActivity
}