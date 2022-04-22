package com.timplifier.kitsu.base

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.timplifier.kitsu.common.either.Either
import com.timplifier.kitsu.presentation.ui.state.UiState
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

abstract class BaseViewModel : ViewModel() {
    protected fun <T> mutableUiStateFlow() = MutableStateFlow<UiState<T>>(UiState.Idle())

    protected fun <T> Flow<Either<String, T>>.gatherRequest(
        state: MutableStateFlow<UiState<T>>,
    ) {
        viewModelScope.launch(Dispatchers.IO) {
            state.value = UiState.Loading()
            this@gatherRequest.collect {
                when (it) {
                    is Either.Left -> state.value = UiState.Error(it.value)
                    is Either.Right -> state.value = UiState.Success(it.value)
                }
            }

        }
    }


}