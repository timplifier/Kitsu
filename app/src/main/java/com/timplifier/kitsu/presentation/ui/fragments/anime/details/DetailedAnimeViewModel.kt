package com.timplifier.kitsu.presentation.ui.fragments.anime.details

import com.timplifier.kitsu.base.BaseViewModel
import com.timplifier.kitsu.data.repositories.AnimeRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class DetailedAnimeViewModel @Inject constructor(
    private val animeRepository: AnimeRepository
) : BaseViewModel() {

    fun fetchAnimeById(id: String) = animeRepository.fetchAnimeById(id)
}