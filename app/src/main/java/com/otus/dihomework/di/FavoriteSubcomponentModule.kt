package com.otus.dihomework.di

import com.otus.dihomework.FavoriteSubcomponent
import com.otus.dihomework.common.domain_api.ConsumeFavoritesUseCase
import com.otus.dihomework.common.domain_impl.ConsumeFavoritesUseCaseImpl
import dagger.Binds
import dagger.Module

@Module(subcomponents = [FavoriteSubcomponent::class])
interface FavoriteSubcomponentModule {

}