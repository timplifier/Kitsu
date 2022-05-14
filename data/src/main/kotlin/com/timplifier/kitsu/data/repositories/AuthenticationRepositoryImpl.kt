package com.timplifier.kitsu.data.repositories

import com.timplifier.kitsu.data.local.preferences.PreferencesHelper
import com.timplifier.kitsu.data.remote.apiservices.AuthenticationApiService
import com.timplifier.kitsu.data.remote.dtos.auth.AuthDto
import com.timplifier.kitsu.data.remote.dtos.auth.toDomain
import com.timplifier.kitsu.data.repositories.base.BaseRepository
import com.timplifier.kitsu.domain.models.auth.TokenModel
import com.timplifier.kitsu.domain.repositories.AuthenticationRepository
import javax.inject.Inject

class AuthenticationRepositoryImpl @Inject constructor(
    private val authenticationApiService: AuthenticationApiService,
    private val preferencesHelper: PreferencesHelper
) : BaseRepository(), AuthenticationRepository {

    override fun authenticate(
        username: String,
        password: String
    ) = sendRequest(this::saveToken) {
        authenticationApiService.authenticate(AuthDto(username = username, password = password))
            .toDomain()
    }

    private fun saveToken(tokenModel: TokenModel) {
        preferencesHelper.accessToken = tokenModel.accessToken
        preferencesHelper.refreshToken = tokenModel.refreshToken
        preferencesHelper.isAuthenticated = true
    }
}