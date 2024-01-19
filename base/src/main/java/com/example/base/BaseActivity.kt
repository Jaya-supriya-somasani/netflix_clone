package com.example.base

import android.os.Parcel
import android.os.Parcelable
import androidx.databinding.ViewDataBinding
import androidx.lifecycle.LifecycleOwner

abstract class BaseActivity<Binding : ViewDataBinding, VM : BaseViewModel>() :
    LifecycleOwner {

}