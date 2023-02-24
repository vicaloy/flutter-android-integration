package com.valoy.notmainlib

import com.valoy.notmainlib.ui.main.FlutterIntegrationService

object LibModule {
    var flutterIntegrationService: FlutterIntegrationService? = null

    fun start(flutterIntegrationService: FlutterIntegrationService){
        this.flutterIntegrationService = flutterIntegrationService
    }
}