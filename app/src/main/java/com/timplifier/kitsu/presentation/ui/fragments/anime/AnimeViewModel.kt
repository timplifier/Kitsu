package com.timplifier.kitsu.presentation.ui.fragments.anime

import com.timplifier.kitsu.base.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel

@HiltViewModel
class AnimeViewModel : BaseViewModel() {
    private val _animeState = mutableUiStateFlow<>()
}