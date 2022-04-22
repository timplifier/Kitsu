package com.timplifier.kitsu.presentation.ui.fragments.anime.details

import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.navArgs
import by.kirich1409.viewbindingdelegate.viewBinding
import com.timplifier.kitsu.R
import com.timplifier.kitsu.base.BaseFragment
import com.timplifier.kitsu.common.extensions.isInternetAvailable
import com.timplifier.kitsu.databinding.FragmentDetailedAnimeBinding
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch


@AndroidEntryPoint
class DetailedAnimeFragment :
    BaseFragment<FragmentDetailedAnimeBinding, DetailedAnimeViewModel>(R.layout.fragment_detailed_anime) {
    override val binding by viewBinding(FragmentDetailedAnimeBinding::bind)
    override val viewModel: DetailedAnimeViewModel by viewModels()
    private val args: DetailedAnimeFragmentArgs by navArgs()

    override fun establishRequest() {
        if (isInternetAvailable(context))
            lifecycleScope.launch {
                viewModel.fetchAnimeById(args.animeId).collect {
                }
            }

    }

}