package com.timplifier.kitsu.presentation.ui.fragments.manga

import android.util.Log
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import com.timplifier.kitsu.R
import com.timplifier.kitsu.databinding.FragmentMangaBinding
import com.timplifier.kitsu.presentation.base.BaseFragment
import com.timplifier.kitsu.presentation.extensions.directionsSafeNavigation
import com.timplifier.kitsu.presentation.ui.adapters.MangaAdapter
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MangaFragment : BaseFragment<FragmentMangaBinding, MangaViewModel>(R.layout.fragment_manga) {
    override val binding by viewBinding(FragmentMangaBinding::bind)
    override val viewModel: MangaViewModel by viewModels()
    private val mangaAdapter = MangaAdapter(this::onItemClick)
    override fun assembleViews() {
        setupAdapter()
    }

    private fun setupAdapter() {
        binding.recyclerview.adapter = mangaAdapter
    }

    override fun launchObservers() {
        viewModel.fetchManga().spectatePaging(
            error = {
                Log.e("tag", it)
            },
            success = {
                mangaAdapter.submitData(it)
            }
        )

    }

    private fun onItemClick(id: String) {
        findNavController().directionsSafeNavigation(
            MangaFragmentDirections.actionMangaFragmentToMangaDetailedFragment(
                id
            )
        )
    }

}