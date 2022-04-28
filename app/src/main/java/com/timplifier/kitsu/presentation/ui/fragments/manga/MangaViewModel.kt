package com.timplifier.kitsu.presentation.ui.fragments.manga

import com.timplifier.kitsu.base.BaseViewModel
import com.timplifier.domain.useCases.FetchMangaUseCase
import com.timplifier.kitsu.presentation.ui.models.manga.MangaListUI
import com.timplifier.kitsu.presentation.ui.models.manga.toUI
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject

@HiltViewModel
class MangaViewModel @Inject constructor(
    private val fetchMangaUseCase: FetchMangaUseCase
) : BaseViewModel() {

    private val _mangaState = mutableUiStateFlow<MangaListUI>()
    var mangaState = _mangaState.asStateFlow()

    init {
        fetchManga()
    }

    fun fetchManga() = fetchMangaUseCase().gatherRequest(_mangaState) { it.toUI() }
}