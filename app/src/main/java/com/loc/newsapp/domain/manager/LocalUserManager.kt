package com.loc.newsapp.domain.manager

import kotlinx.coroutines.flow.Flow

interface LocalUserManager {
    suspend fun saveEntryApp()

    suspend fun readAppEntry(): Flow<Boolean>
}