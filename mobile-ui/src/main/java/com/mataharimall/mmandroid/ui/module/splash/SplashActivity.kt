package com.mataharimall.mmandroid.ui.module.splash

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.mataharimall.mmandroid.presentation.splash.SplashMvp
import com.mataharimall.mmandroid.ui.R
import com.mataharimall.mmandroid.ui.module.login.LoginActivity
import javax.inject.Inject

/**
 * Created by adrie_savana on 12/28/17.
 */
class SplashActivity: AppCompatActivity(), SplashMvp.View {

    @Inject lateinit var onboardingPresenter: SplashMvp.Presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
    }

    override fun setPresenter(presenter: SplashMvp.Presenter) {
        onboardingPresenter = presenter
        onboardingPresenter.setTimerSplash()
    }

    override fun openLoginPage() {
        finish()
        startActivity(Intent(this, LoginActivity::class.java))
    }
}