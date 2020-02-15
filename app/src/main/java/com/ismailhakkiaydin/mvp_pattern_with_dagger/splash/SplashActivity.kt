package com.ismailhakkiaydin.mvp_pattern_with_dagger.splash

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.github.ybq.android.spinkit.SpinKitView
import com.ismailhakkiaydin.mvp_pattern_with_dagger.R
import com.ismailhakkiaydin.mvp_pattern_with_dagger.app.AppModule
import com.ismailhakkiaydin.mvp_pattern_with_dagger.util.intentProcess.IntentModule
import javax.inject.Inject

class SplashActivity: AppCompatActivity(), SplashActivityContract.View {

    private lateinit var progressView : SpinKitView

    @Inject
    lateinit var mPresenter: SplashActivityPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        DaggerSplashActivityComponent.builder()
            .appModule(AppModule(this))
            .intentModule(IntentModule())
            .splashActivityModule(SplashActivityModule())
            .build().inject(this)

        this.mPresenter.setView(this)
        this.mPresenter.create()

    }

    override fun bindViews() {
        this.progressView = findViewById(R.id.sk_progress)
    }

    override fun showProgress() {
        this.progressView.visibility = View.VISIBLE
    }

    override fun hideProgress() {
        this.progressView.visibility = View.GONE
    }

    override fun finishActivity() {
        this.finish()
    }

}