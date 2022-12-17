package com.aljaldak.culmix.feature.register

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.aljaldak.culmix.data.RegisterRequest
import com.aljaldak.culmix.data.serverAPIProvider
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class RegisterViewModel @Inject constructor(

) : ViewModel() {

    var account_id: String? = null
    var password: String? = null
    var last_name: String? = null
    var first_name: String? = null
    var my_lang: String? = "korean, japanese, english"
    var email: String? = null

    private val _pageState = MutableLiveData(1)
    val pageState: LiveData<Int> get() = _pageState

    fun increasePageState() {
        _pageState.value = _pageState.value!! + 1
        Log.d("TAG", "increasePageState: ${pageState.value}")
    }

    fun register() {
        viewModelScope.launch(Dispatchers.IO) {
            kotlin.runCatching {
                serverAPIProvider.register(
                    RegisterRequest(
                        account_id = account_id!!,
                        password = password!!,
                        last_name = last_name!!,
                        first_name = first_name!!,
                        my_lang = my_lang!!,
                        email = email!!,
                    ).also {
                        println(it)
                    }
                )
            }.onSuccess {
                if (it.isSuccessful) {
                    println("Success!!!!!!!")
                }
            }.onFailure {
                println("ERRROR!!! ${it.javaClass.name}")
            }
        }
    }

    fun decreasePageState() {
        _pageState.value!!.minus(1)
    }
}