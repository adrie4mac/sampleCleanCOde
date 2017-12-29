package mmandroid.mataharimall.com.ui.module.splash

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import mmandroid.mataharimall.com.presentation.splash.SplashMvp
import mmandroid.mataharimall.com.ui.R
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
    }

    override fun openLoginPage() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}