package com.timplifier.kitsu.presentation.ui.fragments.manga

import com.timplifier.kitsu.data.repositories.MangaRepositoryImpl
import com.timplifier.kitsu.presentation.base.BaseViewModel
import com.timplifier.kitsu.presentation.models.manga.toUI
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MangaViewModel @Inject constructor(
    private val mangaRepositoryImpl: MangaRepositoryImpl

) : BaseViewModel() {


    fun fetchManga() = mangaRepositoryImpl.fetchPagedManga().gatherPagingRequest { it.toUI() }
}