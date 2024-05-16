package io.github.theapache64.background_thread_poc

import android.app.Activity
import android.app.Application
import android.os.Bundle
import android.os.Handler
import android.os.SystemClock
import io.github.theapache64.background_thread_poc.NextDrawListener.Companion.onNextDraw

class AppStartUpLifeCycleCallbacks :
    Application.ActivityLifecycleCallbacks {

    override fun onActivityCreated(activity: Activity, savedInstanceState: Bundle?) {
        var firstDraw = false
        val window = activity.window
        window?.decorView?.onNextDraw {
            if (firstDraw) return@onNextDraw
            firstDraw = true
            println("QuickTag: AppStartUpLifeCycleCallbacks:onActivityCreated: FFT -> ${SystemClock.uptimeMillis() - StartTimeProvider.providerClassLoadMs}ms")
        }
    }

    override fun onActivityStarted(activity: Activity) {
    }

    override fun onActivityResumed(activity: Activity) {
    }

    override fun onActivityPaused(activity: Activity) {
    }

    override fun onActivityStopped(activity: Activity) {
    }

    override fun onActivitySaveInstanceState(activity: Activity, savedInstanceState: Bundle) {
    }

    override fun onActivityDestroyed(activity: Activity) {
    }
}
