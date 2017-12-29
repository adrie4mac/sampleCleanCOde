package mmandroid.mataharimall.com.ui.module.splash

import mmandroid.mataharimall.com.presentation.splash.SplashMvp
import javax.inject.Inject

/**
 * Created by adrie_savana on 12/28/17.
 */
class SplashPresenter @Inject constructor(val view: SplashMvp.View) : SplashMvp.Presenter {

    init {
        view.setPresenter(this)
    }

    override fun setTimerSplash() {

    }
}