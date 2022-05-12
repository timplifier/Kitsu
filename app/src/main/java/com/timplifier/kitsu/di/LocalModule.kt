package com.timplifier.kitsu.di

import android.content.Context
import com.timplifier.kitsu.data.local.preferences.PreferencesHelper
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object LocalModule {
    @Singleton
    @Provides
    fun providePreferencesHelper(@ApplicationContext context: Context) = PreferencesHelper(context)

}