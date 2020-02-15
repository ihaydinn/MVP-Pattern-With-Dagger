package com.ismailhakkiaydin.mvp_pattern_with_dagger.splash

import com.ismailhakkiaydin.mvp_pattern_with_dagger.util.handlerProcess.HandlerProcessManagement
import dagger.Module
import dagger.Provides

@Module
class SplashActivityModule {
    @Provides
    fun provideHandlerProcessManagement(): HandlerProcessManagement {
        return HandlerProcessManagement()
    }
}