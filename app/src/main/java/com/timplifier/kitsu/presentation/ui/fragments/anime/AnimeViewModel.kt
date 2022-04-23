package com.timplifier.kitsu.presentation.ui.fragments.anime

import com.timplifier.kitsu.base.BaseViewModel
import com.timplifier.kitsu.data.remote.dtos.anime.AnimeListDto
import com.timplifier.kitsu.data.repositories.AnimeRepositoryImpl
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject

@HiltViewModel
class AnimeViewModel @Inject constructor(
    private val animeRepositoryImpl: AnimeRepositoryImpl
) : BaseViewModel() {
    private val _animeState = mutableUiStateFlow<AnimeListDto>()
    var animeState = _animeState.asStateFlow()


    init {
        fetchAnime()
    }

    fun fetchAnime() = animeRepositoryImpl.fetchAnime().gatherRequest(_animeState)

}