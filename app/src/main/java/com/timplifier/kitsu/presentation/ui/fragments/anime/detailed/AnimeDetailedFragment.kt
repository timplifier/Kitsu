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
            binding.apply {

                it.apply {
                    imCover.loadImageWithGlide(animeDto.coverImage?.original)
                    imPoster.loadImageWithGlide(animeDto.posterImage?.original)
                    tvSubtype.text = animeDto.subtype
                    tvYear.text = animeDto.createdAt
                    tvTitle.text = animeDto.titles.en
                    tvSynopsis.text = animeDto.synopsis
                    tvAverageRating.text = "${animeDto.averageRating}%"
                    tvRating.text = "Rank #${animeDto.ratingRank}"
                    tvPopularity.text = "Rank #${animeDto.popularityRank}"
                    //                   tvStudio.text = relationships.
                    tvEpisodes.text = "${animeDto.episodeCount}"
                    tvStatus.text = animeDto.status
                    tvPremiere.text = animeDto.startDate
                    tvAgeRating.text = "${animeDto.ageRating}" + "-" + "${animeDto.ageRatingGuide}"


                }

            }


        }, error = { Log.e("tag", it) }
        )
    }

    override fun establishRequest() {
        viewModel.fetchSingleAnime(args.animeId)
    }

}