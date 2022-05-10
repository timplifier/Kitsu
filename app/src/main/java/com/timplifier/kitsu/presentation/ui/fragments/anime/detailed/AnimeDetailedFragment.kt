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
        viewModel.fetchSingleAnime(args.animeId)
    }

    override fun launchObservers() {
        subscribeToSingleAnime()

    }

    private fun subscribeToSingleAnime() {
        viewModel.singleAnimeState.spectateUiState(success = {
            binding.apply {

                it.apply {
                    imCover.loadImageWithGlide(data.animeDto.coverImage?.original)
                    imPoster.loadImageWithGlide(data.animeDto.posterImage?.medium)
                    tvSubtype.text = data.animeDto.subtype?.uppercase()
                    tvYear.text = data.animeDto.createdAt
                    tvTitle.text = data.animeDto.titles?.en
                    tvSynopsis.text = data.animeDto.synopsis
                    tvAverageRating.text = "${data.animeDto.averageRating}%"
                    tvRating.text = "Rank #${data.animeDto.ratingRank}"
                    tvPopularity.text = "Rank #${data.animeDto.popularityRank}"
                    tvEpisodes.text = "${data.animeDto.episodeCount}"
                    tvStatus.text = data.animeDto.status
                    tvPremiere.text = data.animeDto.startDate
                    tvAgeRating.text =
                        "${data.animeDto.ageRating}" + "-" + "${data.animeDto.ageRatingGuide}"

                }


            }


        }, error = { Log.e("tag", it) }
        )
    }


}