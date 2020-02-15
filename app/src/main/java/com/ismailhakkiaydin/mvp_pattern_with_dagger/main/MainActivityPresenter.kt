package com.ismailhakkiaydin.mvp_pattern_with_dagger.main

import javax.inject.Inject

class MainActivityPresenter @Inject constructor() : MainActivityContract.Presenter {

    private lateinit var mView : MainActivityContract.View

    override fun setView(view: MainActivityContract.View) {

        this.mView = view

    }

    override fun create() {

    }
}