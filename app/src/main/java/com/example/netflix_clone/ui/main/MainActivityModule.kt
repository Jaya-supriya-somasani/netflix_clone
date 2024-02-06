package com.example.netflix_clone.ui.main

import dagger.Module

@Module(includes = [MainActivityModule.ProvidesActivityViewModel::class])
class MainActivityModule {

    @Module
    internal class ProvidesActivityViewModel{

    }
}