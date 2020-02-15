package com.ismailhakkiaydin.mvp_pattern_with_dagger.util.handlerProcess

import android.os.Handler

class HandlerProcessManagement {

    companion object {
        const val DEFAULT_HANDLER_DURATION = 2000L;
    }

    fun providePostDelayedHandler(callback: HandlerCallback, duration: Long) {
        Handler().postDelayed({
            callback.onCompleted()
        }, duration)
    }

}