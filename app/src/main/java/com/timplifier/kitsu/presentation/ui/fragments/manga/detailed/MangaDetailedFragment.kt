package com.timplifier.kitsu.presentation.ui.fragments.manga.detailed

import androidx.fragment.app.viewModels
import by.kirich1409.viewbindingdelegate.viewBinding
import com.timplifier.kitsu.R
import com.timplifier.kitsu.databinding.FragmentMangaDetailedBinding
import com.timplifier.kitsu.presentation.base.BaseFragment


class MangaDetailedFragment :
    BaseFragment<FragmentMangaDetailedBinding, DetailedMangaViewModel>(R.layout.fragment_manga_detailed) {
    override val binding by viewBinding(FragmentMangaDetailedBinding::bind)
    override val viewModel: DetailedMangaViewModel by viewModels()

    override fun launchObservers() {
        subscribeToDetailedManga()
    }

    private fun subscribeToDetailedManga() {
        viewModel.detailedMangaState.spectateUiState(
            success = {

            }
        )

    }

}