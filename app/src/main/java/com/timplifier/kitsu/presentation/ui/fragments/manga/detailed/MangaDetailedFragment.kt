package com.timplifier.kitsu.presentation.ui.fragments.manga.detailed

import androidx.fragment.app.viewModels
import androidx.navigation.fragment.navArgs
import by.kirich1409.viewbindingdelegate.viewBinding
import com.timplifier.kitsu.R
import com.timplifier.kitsu.databinding.FragmentMangaDetailedBinding
import com.timplifier.kitsu.presentation.base.BaseFragment
import com.timplifier.kitsu.presentation.extensions.loadImageWithGlide
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class MangaDetailedFragment :
    BaseFragment<FragmentMangaDetailedBinding, DetailedMangaViewModel>(R.layout.fragment_manga_detailed) {
    override val binding by viewBinding(FragmentMangaDetailedBinding::bind)
    override val viewModel: DetailedMangaViewModel by viewModels()
    private val args: MangaDetailedFragmentArgs by navArgs()

    override fun establishRequest() {
        viewModel.fetchDetailedManga(args.mangaId)
    }

    override fun launchObservers() {
        subscribeToDetailedManga()
    }

    private fun subscribeToDetailedManga() {
        viewModel.detailedMangaState.spectateUiState(
            success = {
                binding.apply {
                    it.apply {
                        imCover.loadImageWithGlide(data.mangaDto.coverImage?.original)
                        imPoster.loadImageWithGlide(data.mangaDto.posterImage?.medium)
                        tvSubtype.text = data.mangaDto.subtype?.uppercase()
                        tvYear.text = data.mangaDto.createdAt
                        tvTitle.text = data.mangaDto.titles?.en
                        tvSynopsis.text = data.mangaDto.synopsis
                        tvAverageRating.text = "${data.mangaDto.averageRating}%"
                        tvRating.text = "Rank #${data.mangaDto.ratingRank}"
                        tvPopularity.text = "Rank #${data.mangaDto.popularityRank}"

                    }
                }

            }
        )

    }

}