package com.ismailhakkiaydin.mvp_pattern_with_dagger.app

import android.content.Context
import dagger.Module
import dagger.Provides

@Module
class AppModule(val context: Context) {

    @Provides
    fun provideContext(): Context{
        return context;
    }

}