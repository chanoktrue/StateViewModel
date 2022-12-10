package com.chanoktrue.stateviewmodel.viewModels

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class MyViewModel: ViewModel() {
    //State
    var email by mutableStateOf("")
    var password by mutableStateOf("")

    //Events
    fun onEmailChange(newString: String) {
        email = newString
    }

    fun onPasswordChange(newString: String) {
        password = newString
    }
}