package com.valoy.notmainlib.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class LibViewModel : ViewModel() {
    val showFlutterQuestionView: LiveData<Unit> get() = mutableShowFlutterQuestionView
    private val mutableShowFlutterQuestionView = MutableLiveData<Unit>()

    fun onButtonClick(){
        mutableShowFlutterQuestionView.value = Unit
    }
}