package com.timplifier.kitsu.presentation.ui.fragments.anime.manga

import com.timplifier.kitsu.base.BaseViewModel
import com.timplifier.kitsu.data.remote.dtos.manga.MangaListDto
import com.timplifier.kitsu.data.repositories.MangaRepositoryImpl
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject

@HiltViewModel
class MangaViewModel @Inject constructor(
    private val mangaRepository: MangaRepositoryImpl
) : BaseViewModel() {

    private val _mangaState = mutableUiStateFlow<MangaListDto>()
    var mangaState = _mangaState.asStateFlow()

    init {
        fetchManga()
    }

    fun fetchManga() = mangaRepository.fetchManga().gatherRequest(_mangaState)
}