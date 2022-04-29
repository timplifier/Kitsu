package com.timplifier.kitsu.presentation.ui.fragments.anime

import com.timplifier.domain.useCases.FetchAnimeUseCase
import com.timplifier.kitsu.presentation.base.BaseViewModel
import com.timplifier.kitsu.presentation.models.anime.AnimeListUI
import com.timplifier.kitsu.presentation.models.anime.toUI
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject

@HiltViewModel
class AnimeViewModel @Inject constructor(
    private val fetchAnimeUseCase: FetchAnimeUseCase
) : BaseViewModel() {
    private val _animeState = mutableUiStateFlow<AnimeListUI>()
    var animeState = _animeState.asStateFlow()


    init {
        fetchAnime()
    }

    fun fetchAnime() = fetchAnimeUseCase().gatherRequest(
        _animeState
    ) { it.toUI() }
}