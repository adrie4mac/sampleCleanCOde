package com.mataharimall.mmandroid.ui.injection

import android.app.Application
import dagger.BindsInstance
import dagger.Component
import dagger.android.support.AndroidSupportInjectionModule
import com.mataharimall.mmandroid.ui.MataharimallApplication
import com.mataharimall.mmandroid.ui.injection.module.ActivityBindingModule
import com.mataharimall.mmandroid.ui.injection.module.ApplicationModule
import com.mataharimall.mmandroid.ui.injection.scopes.PerApplication

/**
 * Created by adrie_savana on 12/29/17.
 */
@PerApplication
@Component(modules = arrayOf(ActivityBindingModule::class, ApplicationModule::class,
        AndroidSupportInjectionModule::class))
interface ApplicationComponent {

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application): Builder

        fun build(): ApplicationComponent
    }

    fun inject(app: MataharimallApplication)
}