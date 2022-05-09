package com.timplifier.kitsu.presentation.ui.fragments.anime.detailed

import com.timplifier.kitsu.domain.useCases.FetchSingleAnimeUseCase
import com.timplifier.kitsu.domain.useCases.FooUseCase
import com.timplifier.kitsu.presentation.base.BaseViewModel
import com.timplifier.kitsu.presentation.models.anime.AnimeDataUI
import com.timplifier.kitsu.presentation.models.anime.AnimeUI
import com.timplifier.kitsu.presentation.models.anime.toUI
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject

@HiltViewModel
class DetailedAnimeViewModel @Inject constructor(
    private val fetchSingleAnimeUseCase: FetchSingleAnimeUseCase,
    private val fetchFooUseCase: FooUseCase
) : BaseViewModel() {
    private val _singleAnimeState = mutableUiStateFlow<AnimeDataUI>()
    var singleAnimeState = _singleAnimeState.asStateFlow()

    private val _detailedAnimeState = mutableUiStateFlow<AnimeUI>()
    var detailedAnimeState = _detailedAnimeState.asStateFlow()


    fun fetchSingleAnime(id: String) =
        fetchSingleAnimeUseCase(id).gatherRequest(_singleAnimeState) { it.toUI() }

    fun fetchDetailedAnime(id: String) =
        fetchFooUseCase(id).gatherRequest(_detailedAnimeState) { it.toUI() }
}