package com.valoy.myandroid

import android.content.Context
import android.content.Intent
import com.valoy.myandroid.ui.FlutterStartActivity
import com.valoy.notmainlib.ui.main.FlutterIntegrationService

class AppFlutterIntegrationService: FlutterIntegrationService {

    override fun getQuestionViewIntent(context: Context): Intent {
        return FlutterStartActivity
            .withCachedEngine(App.FLUTTER_ENGINE_ID)
            .build(context)
    }
}