package com.otus.dihomework

import com.otus.dihomework.common.di.FeatureScope
import com.otus.dihomework.features.favorites.FavoritesViewModelFactory
import dagger.Subcomponent

@FeatureScope
@Subcomponent
interface FavoriteSubcomponent {

    @Subcomponent.Factory
    interface Factory {
        fun create(): FavoriteSubcomponent
    }

    fun favoritesViewModelFactory(): FavoritesViewModelFactory

}

