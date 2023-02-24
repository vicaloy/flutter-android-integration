package com.valoy.notmainlib.ui.main

import android.content.Context
import android.content.Intent

interface FlutterIntegrationService {
    fun getQuestionViewIntent(context: Context): Intent
}