package com.timplifier.kitsu.presentation.ui.fragments.anime

import android.util.Log
import androidx.fragment.app.viewModels
import by.kirich1409.viewbindingdelegate.viewBinding
import com.timplifier.kitsu.R
import com.timplifier.kitsu.databinding.FragmentAnimeBinding
import com.timplifier.kitsu.presentation.base.BaseFragment
import com.timplifier.kitsu.presentation.extensions.isInternetAvailable
import com.timplifier.kitsu.presentation.extensions.submitData
import com.timplifier.kitsu.presentation.ui.adapters.AnimeAdapter
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class AnimeFragment : BaseFragment<FragmentAnimeBinding, AnimeViewModel>(R.layout.fragment_anime) {
    override val binding by viewBinding(FragmentAnimeBinding::bind)
    override val viewModel: AnimeViewModel by viewModels()
    private val animeAdapter = AnimeAdapter()
    override fun assembleViews() {
        setupAdapter()
    }

    private fun setupAdapter() {
        binding.recyclerview.adapter = animeAdapter

    }

    override fun launchObservers() {
        viewModel.animeState.spectateUiState(
            error = {
                Log.e("tag", it)
            },
            success = {
                animeAdapter.submitData(it.data)
            })
    }

    override fun establishRequest() {
        if (viewModel.animeState.value == null && isInternetAvailable(context))
            viewModel.fetchAnime()
    }
}