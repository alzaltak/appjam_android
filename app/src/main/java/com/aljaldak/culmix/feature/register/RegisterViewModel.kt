package com.aljaldak.culmix.feature.register

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class RegisterViewModel @Inject constructor(

): ViewModel() {

    private val _pageState = MutableLiveData(1)
    val pageState: LiveData<Int> get() = _pageState

    fun increasePageState() {
        _pageState.value = _pageState.value!! + 1
        Log.d("TAG", "increasePageState: ${pageState.value}")
    }

    fun decreasePageState() {
        _pageState.value!!.minus(1)
    }
}