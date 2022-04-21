package com.timplifier.kitsu.base

import android.os.Bundle
import android.view.View
import androidx.annotation.LayoutRes
import androidx.fragment.app.Fragment
import androidx.lifecycle.Lifecycle
import androidx.viewbinding.ViewBinding
import com.timplifier.kitsu.presentation.ui.state.UiState
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.collect

abstract class BaseFragment<Binding : ViewBinding, ViewModel : BaseViewModel>(@LayoutRes layoutId: Int) :
    Fragment(
        layoutId
    ) {
    protected abstract val binding: Binding
    protected abstract val viewModel: ViewModel
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initialize()
        assembleViews()
        setupListeners()
        establishRequest()
        launchObservers()

    }

    protected open fun initialize() {
    }

    protected open fun assembleViews() {
    }

    protected open fun setupListeners() {
    }


    protected open fun establishRequest() {

    }

    protected open fun launchObservers() {

    }

    protected fun <T> StateFlow<UiState<T>>.spectateUiState(
        lifecycleState: Lifecycle.State = Lifecycle.State.STARTED,
        success: ((data: T) -> Unit)? = null,
        loading: ((data: UiState.Loading<T>) -> Unit)? = null,
        error: ((error: String) -> Unit)?,
        idle: ((idle: UiState.Idle<T>) -> Unit)? = null,
        gatherIfSucceed: ((state: UiState<T>) -> Unit)? = null
    ) {
        collect {
            gatherIfSucceed?.invoke(it)
            when (it) {
                is UiState.Idle -> idle?.invoke(it)
                is UiState.Loading -> loading?.invoke(it)
                is UiState.Error -> error?.invoke(it.error)
                is UiState.Success -> success?.invoke(it.data)
            }
        }

    }
}