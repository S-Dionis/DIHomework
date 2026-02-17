package com.otus.dihomework.features.favorites

import com.otus.dihomework.common.domain_api.ConsumeProductsUseCase
import com.otus.dihomework.common.domain_api.ToggleFavoriteUseCase

interface ProductsDependencies {
    fun consumeProductsUseCase(): ConsumeProductsUseCase
    fun toggleFavoriteUseCase(): ToggleFavoriteUseCase
}