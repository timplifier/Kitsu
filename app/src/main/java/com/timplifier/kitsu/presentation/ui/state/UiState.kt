package com.timplifier.kitsu.presentation.ui.state

sealed class UiState<T> {
    class Idle<T> : UiState<T>()
    class Loading<T> : UiState<T>()
    class Error<T>(val error: String) : UiState<T>()
    class Success<T>(val data: T) : UiState<T>()

}