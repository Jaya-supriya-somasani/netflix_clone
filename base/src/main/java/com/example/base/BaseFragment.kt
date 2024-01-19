package com.example.base

import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment

/**
 * Base Fragment of all the fragments
 *
 * @param <VM>
 * @param <Binding>
</Binding></VM> */
abstract class BaseFragment<Binding : ViewDataBinding, VM : BaseViewModel> : Fragment() {

}