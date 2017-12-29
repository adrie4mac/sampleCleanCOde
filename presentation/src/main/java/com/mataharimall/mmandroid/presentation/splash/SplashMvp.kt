package com.mataharimall.mmandroid.presentation.splash

import com.mataharimall.mmandroid.presentation.BasePresenter
import com.mataharimall.mmandroid.presentation.BaseView

/**
 * Created by adrie_savana on 12/28/17.
 */
interface SplashMvp {

    interface View : BaseView<Presenter> {
        fun openLoginPage()
    }

    interface Presenter : BasePresenter {
        fun setTimerSplash()
    }
}