package com.timplifier.kitsu.presentation.ui.fragments.anime

import com.timplifier.kitsu.data.repositories.AnimeRepositoryImpl
import com.timplifier.kitsu.presentation.base.BaseViewModel
import com.timplifier.kitsu.presentation.models.anime.toUI
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class AnimeViewModel @Inject constructor(
    private val animeRepositoryImpl: AnimeRepositoryImpl
) : BaseViewModel() {

    fun fetchAnime() =
        animeRepositoryImpl.fetchPagedAnime().gatherPagingRequest {
            it.toUI()
        }


}