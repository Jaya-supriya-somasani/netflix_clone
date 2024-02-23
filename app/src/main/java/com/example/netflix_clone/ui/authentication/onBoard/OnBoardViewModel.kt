package com.example.netflix_clone.ui.authentication.onBoard

import com.example.base.BaseViewModel
import com.example.base.utils.ConflatedChannel
import com.example.base.utils.sendValue

class OnBoardViewModel : BaseViewModel() {
    val loginEventClick = ConflatedChannel<Unit>()

    fun navigateToLoginScreen() {
        loginEventClick.sendValue(Unit)
    }
}