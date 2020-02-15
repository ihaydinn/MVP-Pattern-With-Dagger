package com.ismailhakkiaydin.mvp_pattern_with_dagger.splash

import com.ismailhakkiaydin.mvp_pattern_with_dagger.util.handlerProcess.HandlerCallback
import com.ismailhakkiaydin.mvp_pattern_with_dagger.util.handlerProcess.HandlerProcessManagement
import com.ismailhakkiaydin.mvp_pattern_with_dagger.util.intentProcess.IntentHelper
import javax.inject.Inject

class SplashActivityPresenter @Inject constructor() : SplashActivityContract.Presenter {

    private lateinit var mView : SplashActivityContract.View

    @Inject
    lateinit var mHandlerProcessManagement: HandlerProcessManagement

    @Inject
    lateinit var mIntentHelper: IntentHelper

    override fun setView(view: SplashActivityContract.View) {

        this.mView = view;

    }

    override fun create() {

        this.mView.bindViews()
        this.mView.showProgress()

        this.mHandlerProcessManagement.providePostDelayedHandler(object : HandlerCallback{
            override fun onCompleted() {
                mView.hideProgress()
                mIntentHelper.intentToMainActivity()
                mView.finishActivity()
            }
        }, HandlerProcessManagement.DEFAULT_HANDLER_DURATION)

    }
}