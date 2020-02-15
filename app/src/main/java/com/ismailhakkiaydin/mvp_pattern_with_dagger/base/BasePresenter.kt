package com.ismailhakkiaydin.mvp_pattern_with_dagger.base

interface BasePresenter<T : BaseView> {

    fun setView(view: T)

    fun create()

}