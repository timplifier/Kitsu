package com.timplifier.kitsu.presentation.ui.fragments.anime.detailed

import android.util.Log
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.navArgs
import by.kirich1409.viewbindingdelegate.viewBinding
import com.timplifier.kitsu.R
import com.timplifier.kitsu.databinding.FragmentAnimeDetailedBinding
import com.timplifier.kitsu.presentation.base.BaseFragment
import com.timplifier.kitsu.presentation.extensions.loadImageWithGlide
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class AnimeDetailedFragment :
    BaseFragment<FragmentAnimeDetailedBinding, DetailedAnimeViewModel>(R.layout.fragment_anime_detailed) {
    override val binding by viewBinding(FragmentAnimeDetailedBinding::bind)
    override val viewModel: DetailedAnimeViewModel by viewModels()
    private val args: AnimeDetailedFragmentArgs by navArgs()

    override fun launchObservers() {
        subscribeToSingleAnime()

    }

    private fun subscribeToSingleAnime() {
        viewModel.singleAnimeState.spectateUiState(success = {
            binding.imCover.loadImageWithGlide(it.animeDto?.coverImage?.original)


        }, error = { Log.e("tag", it) }
        )
    }

    override fun establishRequest() {
        viewModel.fetchSingleAnime(args.animeId)
    }

}