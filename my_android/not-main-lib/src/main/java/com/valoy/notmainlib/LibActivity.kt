package com.valoy.notmainlib

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.valoy.notmainlib.LibModule.flutterIntegrationService
import com.valoy.notmainlib.ui.main.LibFragment

class LibActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lib)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, LibFragment.newInstance())
                .commitNow()
        }
    }
}