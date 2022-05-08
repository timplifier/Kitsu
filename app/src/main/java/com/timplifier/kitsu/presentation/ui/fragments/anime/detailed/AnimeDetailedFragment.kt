package com.timplifier.kitsu.presentation.ui.fragments.anime.detailed

import androidx.fragment.app.viewModels
import by.kirich1409.viewbindingdelegate.viewBinding
import com.timplifier.kitsu.R
import com.timplifier.kitsu.databinding.FragmentAnimeDetailedBinding
import com.timplifier.kitsu.presentation.base.BaseFragment


class AnimeDetailedFragment :
    BaseFragment<FragmentAnimeDetailedBinding, AnimeDetailedViewModel>(R.layout.fragment_anime_detailed) {
    override val binding by viewBinding(FragmentAnimeDetailedBinding::bind)
    override val viewModel: AnimeDetailedViewModel by viewModels()


}