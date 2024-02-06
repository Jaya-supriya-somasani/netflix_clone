package com.example.netflix_clone.ui.di

import android.app.Application
import com.example.netflix_clone.ui.app.NetflixApp
import com.example.netflix_clone.ui.module.AppModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import javax.inject.Singleton

/**
 * AndroidInjectionModule is a Dagger module necessary for Dagger Android support.*/
@Singleton
@Component(
    modules = [AndroidInjectionModule::class, AppModule::class]
)
interface AppComponent : AndroidInjector<NetflixApp> {
    /**
     * @Component.Builder is a part of the component and will be used to construct instances of AppComponent.*/
    @Component.Builder
    interface Builder {

        /**
         * allow binding an instance  (in this case, Application) to the component during construction.
        This is useful when you need to pass an instance at component creation time.
        It's called after setting all the necessary bindings.*/
        @BindsInstance
        fun application(application: Application): Builder

        fun build(): AppComponent
    }
}