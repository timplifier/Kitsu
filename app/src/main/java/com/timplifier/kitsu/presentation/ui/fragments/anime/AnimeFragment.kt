package com.timplifier.kitsu.presentation.ui.fragments.anime

import androidx.fragment.app.viewModels
import by.kirich1409.viewbindingdelegate.viewBinding
import com.timplifier.kitsu.R
import com.timplifier.kitsu.base.BaseFragment
import com.timplifier.kitsu.databinding.FragmentAnimeBinding
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class AnimeFragment : BaseFragment<FragmentAnimeBinding, AnimeViewModel>(R.layout.fragment_anime) {
    override val binding by viewBinding(FragmentAnimeBinding::bind)
    override val viewModel: AnimeViewModel by viewModels()

}