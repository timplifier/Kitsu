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


    override fun establishRequest() {
        viewModel.fetchDetailedAnime(args.animeId)
    }

    override fun launchObservers() {
        subscribeToSingleAnime()

    }

    private fun subscribeToSingleAnime() {
        viewModel.detailedAnimeState.spectateUiState(success = {
            binding.apply {

                imCover.loadImageWithGlide(it.coverImage?.original)
                imPoster.loadImageWithGlide(it.posterImage?.original)
                tvSubtype.text = it.subtype
                tvYear.text = it.createdAt
                tvTitle.text = it.titles?.en
                tvSynopsis.text = it.synopsis
//             //   tvAverageRating.text = "${it.averageRating}%"
//                tvRating.text = "Rank #${it.ratingRank}"
//                tvPopularity.text = "Rank #${it.popularityRank}"
//                tvEpisodes.text = "${it.episodeCount}"
//                tvStatus.text = it.status
//                tvPremiere.text = it.startDate
//                tvAgeRating.text = "${it.ageRating}" + "-" + "${it.ageRatingGuide}"


            }


        }, error = { Log.e("tag", it) }
        )
    }


}