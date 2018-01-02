package com.mataharimall.mmandroid.ui.injection.component

import com.mataharimall.mmandroid.ui.module.login.LoginActivity
import dagger.Subcomponent
import dagger.android.AndroidInjector

/**
 * Created by adrie_savana on 12/29/17.
 */
@Subcomponent
interface LoginActivitySubComponent : AndroidInjector<LoginActivity> {

    @Subcomponent.Builder
    abstract class Builder : AndroidInjector.Builder<LoginActivity>()
}