package com.ismailhakkiaydin.mvp_pattern_with_dagger.splash

import com.ismailhakkiaydin.mvp_pattern_with_dagger.util.intentProcess.IntentModule
import com.ismailhakkiaydin.mvp_pattern_with_dagger.app.AppModule
import dagger.Component

@Component(
    modules = [
        (AppModule::class),
        (IntentModule::class),
        (SplashActivityModule::class)
    ]
)
interface SplashActivityComponent {

    fun inject(activity: SplashActivity)
}