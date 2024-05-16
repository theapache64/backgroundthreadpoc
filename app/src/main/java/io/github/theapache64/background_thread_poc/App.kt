package io.github.theapache64.background_thread_poc

import android.app.Application

class App : Application() {
    override fun onCreate() {
        super.onCreate()
        (applicationContext as Application).registerActivityLifecycleCallbacks(
            AppStartUpLifeCycleCallbacks()
        )
    }
}