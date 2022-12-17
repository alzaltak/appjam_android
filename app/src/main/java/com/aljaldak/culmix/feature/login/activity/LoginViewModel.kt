package com.aljaldak.culmix.feature.login.activity

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.aljaldak.culmix.data.LoginRequsest
import com.aljaldak.culmix.data.serverAPIProvider
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class LoginViewModel : ViewModel() {

    private val _loginResponse = MutableLiveData<Boolean>()
    val loginResponse: LiveData<Boolean>
        get() = _loginResponse

    fun login(
        loginRequest: LoginRequsest,
    ) {
        viewModelScope.launch(Dispatchers.IO) {
            kotlin.runCatching {
                serverAPIProvider.login(
                    loginRequest,
                )
            }.onSuccess {
                _loginResponse.postValue(true)
            }
        }
    }
}