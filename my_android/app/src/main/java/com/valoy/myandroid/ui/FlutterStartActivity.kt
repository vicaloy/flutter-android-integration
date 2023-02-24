package com.valoy.myandroid.ui

import android.content.Context
import android.content.ContextWrapper
import android.content.Intent
import android.content.IntentFilter
import android.os.BatteryManager
import android.os.Build
import androidx.fragment.app.FragmentActivity
import com.valoy.myandroid.AllFlutterChannel
import io.flutter.embedding.android.FlutterFragmentActivity
import io.flutter.embedding.engine.FlutterEngine

class FlutterStartActivity : FlutterFragmentActivity() {

    companion object {
        fun withCachedEngine(engineId: String) = CustomCachedEngineIntentBuilder(engineId)
    }

    class CustomCachedEngineIntentBuilder(engineId: String) :
        CachedEngineIntentBuilder(FlutterStartActivity::class.java, engineId)

    override fun configureFlutterEngine(flutterEngine: FlutterEngine) {
        super.configureFlutterEngine(flutterEngine)
        flutterEngine.installChannels(this)
    }

}

fun FlutterEngine.installChannels(activity: FragmentActivity) {
    AllFlutterChannel().setupMethods(this, activity.applicationContext)
}