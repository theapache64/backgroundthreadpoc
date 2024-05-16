package io.github.theapache64.background_thread_poc

import android.app.Application
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlin.math.sqrt

class App : Application() {
    private val backgroundScope = CoroutineScope(Dispatchers.Default)

    override fun onCreate() {
        super.onCreate()
        (applicationContext as Application).registerActivityLifecycleCallbacks(
            AppStartUpLifeCycleCallbacks()
        )

        /*backgroundScope.launch {
            println("QuickTag: App:onCreate: Starting CPU intensive task")
            // simulate CPU intensive task
            for(i in 0..10000000){
                launch {
                    for (k in 0..1000000000) {
                        // simulate CPU intensive operation
                        sqrt(k.toDouble())
                    }
                }
            }
            println("QuickTag: App:onCreate: CPU intensive task completed")
        }*/
    }
}