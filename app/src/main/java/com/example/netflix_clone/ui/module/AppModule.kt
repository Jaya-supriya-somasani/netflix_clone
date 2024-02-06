package com.example.netflix_clone.ui.module

import android.app.Application
import android.content.Context
import dagger.Module
import dagger.Provides

@Module
class AppModule {
    /**
     * Provides Context of the Application
     */
    @Provides
    internal fun providesContext(application: Application): Context {
        return application
    }
}