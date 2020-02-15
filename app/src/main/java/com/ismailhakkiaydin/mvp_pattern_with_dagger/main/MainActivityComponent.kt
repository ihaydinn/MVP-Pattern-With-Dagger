package com.ismailhakkiaydin.mvp_pattern_with_dagger.main

import dagger.Component
import javax.inject.Singleton
import com.ismailhakkiaydin.mvp_pattern_with_dagger.app.AppModule


@Singleton
@Component(modules = [AppModule::class])
interface MainActivityComponent {

    fun inject(activity: MainActivity)

}