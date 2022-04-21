package com.timplifier.kitsu.presentation.ui.fragments.anime

import com.timplifier.kitsu.base.BaseViewModel
import com.timplifier.kitsu.data.remote.dtos.anime.Data
import com.timplifier.kitsu.data.repositories.AnimeRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject

@HiltViewModel
class AnimeViewModel @Inject constructor(
    private val animeRepository: AnimeRepository
) : BaseViewModel() {
    private val _animeState = mutableUiStateFlow<List<Data>>()
    var animeState = _animeState.asStateFlow()


    fun fetchAnime() = animeRepository.fetchAnime().gatherRequest(_animeState)

}