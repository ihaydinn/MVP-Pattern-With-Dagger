package com.ismailhakkiaydin.mvp_pattern_with_dagger.util.intentProcess

import android.content.Context
import dagger.Module
import dagger.Provides

@Module
class IntentModule {

    @Provides
    fun provideIntentHelper(context: Context): IntentHelper {
        return IntentHelper(context)
    }

}