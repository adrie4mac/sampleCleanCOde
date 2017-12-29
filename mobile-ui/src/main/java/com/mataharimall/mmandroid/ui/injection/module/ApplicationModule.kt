package com.mataharimall.mmandroid.ui.injection.module

import android.app.Application
import android.content.Context
import dagger.Module
import dagger.Provides
import com.mataharimall.mmandroid.data.executor.JobExecutor
import com.mataharimall.mmandroid.domain.executor.PostExecutionThread
import com.mataharimall.mmandroid.domain.executor.ThreadExecutor
import com.mataharimall.mmandroid.ui.UiThread
import com.mataharimall.mmandroid.ui.injection.scopes.PerApplication

/**
 * Module used to provide dependencies at an application-level.
 */
@Module
open class ApplicationModule {

    @Provides
    @PerApplication
    fun provideContext(application: Application): Context {
        return application
    }

    @Provides
    @PerApplication
    internal fun provideThreadExecutor(jobExecutor: JobExecutor): ThreadExecutor {
        return jobExecutor
    }

    @Provides
    @PerApplication
    internal fun providePostExecutionThread(uiThread: UiThread): PostExecutionThread {
        return uiThread
    }
}