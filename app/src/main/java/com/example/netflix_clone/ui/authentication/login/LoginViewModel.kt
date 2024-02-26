package com.example.netflix_clone.ui.authentication.login

import android.content.ContentValues.TAG
import android.util.Log
import com.example.base.BaseViewModel
import com.example.base.utils.ConflatedChannel
import com.example.base.utils.sendValue
import kotlinx.coroutines.flow.MutableStateFlow

class LoginViewModel : BaseViewModel() {
    val signUpEvent = ConflatedChannel<Unit>()
    val emailOrPhoneNumberFlow = MutableStateFlow("")
    val passwordFlow = MutableStateFlow("")
    val credentialsValidateEvent = ConflatedChannel<Unit>()

    fun navigateToSignup() {
        signUpEvent.sendValue(Unit)
    }

    fun navigateToSignIn() {
        credentialsValidateEvent.sendValue(Unit)
    }

    fun signInUser() {
        Log.d(TAG, "Sign-in email ${emailOrPhoneNumberFlow.value} password ${passwordFlow.value}")
    }

}