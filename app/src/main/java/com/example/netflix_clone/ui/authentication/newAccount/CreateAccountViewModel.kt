package com.example.netflix_clone.ui.authentication.newAccount

import com.example.base.BaseViewModel
import com.example.base.utils.ConflatedChannel
import com.example.base.utils.sendValue

class CreateAccountViewModel : BaseViewModel() {

    val loginEvent = ConflatedChannel<Unit>()
    val helpEvent = ConflatedChannel<Unit>()
    fun navigateToCreateAccount() {}
    fun navigateToLogin() {
        loginEvent.sendValue(Unit)
    }
    fun navigateToHelp() {
        helpEvent.sendValue(Unit)
    }
}