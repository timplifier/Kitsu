package com.timplifier.kitsu.presentation.ui.fragments.anime

import android.util.Log
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import by.kirich1409.viewbindingdelegate.viewBinding
import com.timplifier.kitsu.R
import com.timplifier.kitsu.base.BaseFragment
import com.timplifier.kitsu.common.extensions.submitData
import com.timplifier.kitsu.databinding.FragmentAnimeBinding
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
        binding.recyclerview.apply {
            adapter = animeAdapter
            layoutManager = LinearLayoutManager(context)

        }
    }

    override fun launchObservers() {
        viewModel.animeState.spectateUiState(
            error = {
                Log.e("gaypop", it)
            }, success = {
                animeAdapter.submitData(it.data)
            })
    }
}




