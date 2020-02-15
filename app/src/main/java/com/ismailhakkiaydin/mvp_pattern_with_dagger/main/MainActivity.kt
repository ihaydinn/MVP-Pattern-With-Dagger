package com.ismailhakkiaydin.mvp_pattern_with_dagger.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ismailhakkiaydin.mvp_pattern_with_dagger.R
import com.ismailhakkiaydin.mvp_pattern_with_dagger.app.AppModule
import javax.inject.Inject

class MainActivity : AppCompatActivity(), MainActivityContract.View {

    @Inject
    lateinit var mPresenter: MainActivityPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        DaggerMainActivityComponent.builder()
            .appModule(AppModule(this))
            .build().inject(this)

        this.mPresenter.setView(this)
        this.mPresenter.create()
    }

    override fun bindViews() {
    }
}
