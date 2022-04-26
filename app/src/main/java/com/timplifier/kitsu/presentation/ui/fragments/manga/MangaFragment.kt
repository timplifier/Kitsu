package com.timplifier.kitsu.presentation.ui.fragments.manga

import android.util.Log
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import by.kirich1409.viewbindingdelegate.viewBinding
import com.timplifier.kitsu.R
import com.timplifier.kitsu.base.BaseFragment
import com.timplifier.kitsu.common.extensions.submitData
import com.timplifier.kitsu.databinding.FragmentMangaBinding
import com.timplifier.kitsu.presentation.ui.adapters.MangaAdapter
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MangaFragment : BaseFragment<FragmentMangaBinding, MangaViewModel>(R.layout.fragment_manga) {
    override val binding by viewBinding(FragmentMangaBinding::bind)
    override val viewModel: MangaViewModel by viewModels()
    private val mangaAdapter = MangaAdapter()
    override fun assembleViews() {
        setupAdapter()
    }

    private fun setupAdapter() {
        val linearLayoutManager = LinearLayoutManager(context)
        binding.recyclerview.adapter = mangaAdapter
        binding.recyclerview.layoutManager = linearLayoutManager
    }

    override fun launchObservers() {
        viewModel.mangaState.spectateUiState(
            error = {
                Log.e("gaypop", it)

            }, success = {
                mangaAdapter.submitData(it.data)
            }
        )

    }

}