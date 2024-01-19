package com.example.base

import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment

abstract class BaseFragment<Binding : ViewDataBinding, VM : BaseViewModel> : Fragment() {

}