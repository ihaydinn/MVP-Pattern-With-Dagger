package com.ismailhakkiaydin.mvp_pattern_with_dagger.splash

import com.ismailhakkiaydin.mvp_pattern_with_dagger.base.BasePresenter
import com.ismailhakkiaydin.mvp_pattern_with_dagger.base.BaseView

interface SplashActivityContract {


    interface View: BaseView{
        fun finishActivity()
    }

    interface Presenter: BasePresenter<View>{

    }


}