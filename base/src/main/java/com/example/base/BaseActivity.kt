package com.example.base

import androidx.databinding.ViewDataBinding
import androidx.lifecycle.LifecycleOwner

abstract class BaseActivity<Binding : ViewDataBinding, VM : BaseViewModel> :
    LifecycleOwner {

    }