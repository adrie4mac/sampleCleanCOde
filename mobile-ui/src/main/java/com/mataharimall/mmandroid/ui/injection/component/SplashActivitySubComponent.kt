package com.mataharimall.mmandroid.ui.injection.component

import dagger.Subcomponent
import dagger.android.AndroidInjector
import com.mataharimall.mmandroid.ui.module.splash.SplashActivity

/**
 * Created by adrie_savana on 12/29/17.
 */
@Subcomponent
interface SplashActivitySubComponent : AndroidInjector<SplashActivity> {

    @Subcomponent.Builder
    abstract class Builder : AndroidInjector.Builder<SplashActivity>()
}