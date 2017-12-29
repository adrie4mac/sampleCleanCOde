package com.mataharimall.mmandroid.ui.injection.module

import com.mataharimall.mmandroid.presentation.splash.SplashMvp
import com.mataharimall.mmandroid.presentation.splash.SplashPresenter
import com.mataharimall.mmandroid.ui.injection.scopes.PerActivity
import com.mataharimall.mmandroid.ui.module.splash.SplashActivity
import dagger.Module
import dagger.Provides

/**
 * Module used to provide dependencies at an activity-level.
 */
@Module
open class SplashActivityModule {

    @PerActivity
    @Provides
    internal fun provideSplashView(splashActivity: SplashActivity): SplashMvp.View {
        return splashActivity
    }

    @PerActivity
    @Provides
    internal fun provideSplashPresenter(view: SplashMvp.View): SplashMvp.Presenter {
        return SplashPresenter(view)
    }

}