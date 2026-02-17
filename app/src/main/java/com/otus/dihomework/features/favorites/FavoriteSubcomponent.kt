package com.otus.dihomework.features.favorites

import com.otus.dihomework.common.di.FeatureScope
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