package com.example.netflix_clone.ui.authentication.signup

import com.example.base.BaseViewModel
import com.example.base.utils.ConflatedChannel
import com.example.base.utils.sendValue
import kotlinx.coroutines.flow.MutableStateFlow

class SignUpViewModel : BaseViewModel() {

    val emailTextFlow = MutableStateFlow("")
    val getStartedEvent = ConflatedChannel<Unit>()
    fun btnClicked() {
        getStartedEvent.sendValue(Unit)
    }
}