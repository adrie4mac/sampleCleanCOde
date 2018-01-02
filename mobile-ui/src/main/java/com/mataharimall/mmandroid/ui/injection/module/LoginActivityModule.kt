package com.mataharimall.mmandroid.ui.injection.module

import com.mataharimall.mmandroid.presentation.login.LoginMvp
import com.mataharimall.mmandroid.presentation.login.LoginPresenter
import com.mataharimall.mmandroid.ui.injection.scopes.PerActivity
import com.mataharimall.mmandroid.ui.module.login.LoginActivity
import dagger.Module
import dagger.Provides

/**
 * Module used to provide dependencies at an activity-level.
 */
@Module
open class LoginActivityModule {

    @PerActivity
    @Provides
    internal fun provideLoginView(loginActivity: LoginActivity): LoginMvp.View {
        return loginActivity
    }

    @PerActivity
    @Provides
    internal fun provideLoginPresenter(view: LoginMvp.View): LoginMvp.Presenter {
        return LoginPresenter(view)
    }
}