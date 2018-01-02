package com.mataharimall.mmandroid.ui.injection.module

import dagger.Module
import dagger.android.ContributesAndroidInjector
import com.mataharimall.mmandroid.ui.injection.scopes.PerActivity
import com.mataharimall.mmandroid.ui.module.login.LoginActivity
import com.mataharimall.mmandroid.ui.module.splash.SplashActivity

/**
 * Created by adrie_savana on 12/29/17.
 */
@Module
abstract class ActivityBindingModule {

    @PerActivity
    @ContributesAndroidInjector(modules = arrayOf(SplashActivityModule::class))
    abstract fun bindSplashActivity(): SplashActivity

    @PerActivity
    @ContributesAndroidInjector(modules = arrayOf(LoginActivityModule::class))
    abstract fun bindLoginActivity(): LoginActivity
}