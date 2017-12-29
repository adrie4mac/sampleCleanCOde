package mmandroid.mataharimall.com.presentation.splash

import mmandroid.mataharimall.com.presentation.BasePresenter
import mmandroid.mataharimall.com.presentation.BaseView

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