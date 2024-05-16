package io.github.theapache64.background_thread_poc

import android.app.Application
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers

class App : Application() {
    private val backgroundScope = CoroutineScope(Dispatchers.Default)

    override fun onCreate() {
        super.onCreate()
        (applicationContext as Application).registerActivityLifecycleCallbacks(
            AppStartUpLifeCycleCallbacks()
        )

    }
}