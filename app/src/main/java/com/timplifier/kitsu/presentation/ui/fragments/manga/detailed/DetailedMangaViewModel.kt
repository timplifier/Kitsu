package com.timplifier.kitsu.presentation.ui.fragments.manga.detailed

import com.timplifier.kitsu.domain.useCases.FetchDetailedMangaUseCase
import com.timplifier.kitsu.presentation.base.BaseViewModel
import com.timplifier.kitsu.presentation.models.manga.SingleMangaUI
import com.timplifier.kitsu.presentation.models.manga.toUI
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject

@HiltViewModel
class DetailedMangaViewModel @Inject constructor(
    private val fetchDetailedMangaUseCase: FetchDetailedMangaUseCase
) : BaseViewModel() {

    private val _detailedMangaState = mutableUiStateFlow<SingleMangaUI>()
    var detailedMangaState = _detailedMangaState.asStateFlow()

    fun fetchDetailedManga(id: String) =
        fetchDetailedMangaUseCase(id).gatherRequest(_detailedMangaState) { it.toUI() }
}