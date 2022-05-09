package com.timplifier.kitsu.presentation.ui.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.timplifier.kitsu.presentation.ui.fragments.anime.AnimeFragment
import com.timplifier.kitsu.presentation.ui.fragments.manga.MangaFragment

class ViewPagerAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle) :
    FragmentStateAdapter(fragmentManager, lifecycle) {
    override fun getItemCount() = TABS_COUNT

    override fun createFragment(position: Int): Fragment {
        when (position) {
            0 -> AnimeFragment()
            1 -> MangaFragment()
        }
        return AnimeFragment()
    }

    companion object {
        const val TABS_COUNT = 2
    }
}