package com.ismailhakkiaydin.mvp_pattern_with_dagger.main

import com.ismailhakkiaydin.mvp_pattern_with_dagger.base.BasePresenter
import com.ismailhakkiaydin.mvp_pattern_with_dagger.base.BaseView

interface MainActivityContract {

    interface View : BaseView {

    }

    interface Presenter : BasePresenter<View>{

    }

}