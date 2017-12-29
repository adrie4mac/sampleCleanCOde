package com.mataharimall.mmandroid.presentation.splash

import javax.inject.Inject

/**
 * Created by adrie_savana on 12/29/17.
 */
class SplashPresenter @Inject constructor(val view: SplashMvp.View): SplashMvp.Presenter {

    init {
        view.setPresenter(this)
    }

    override fun setTimerSplash() {
        view.openLoginPage()
    }
}