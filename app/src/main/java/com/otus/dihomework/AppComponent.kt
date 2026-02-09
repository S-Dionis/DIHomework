package com.otus.dihomework

import android.content.Context
import com.otus.dihomework.common.data.ProductApiService
import com.otus.dihomework.common.domain_api.ConsumeProductsUseCase
import com.otus.dihomework.common.domain_api.ToggleFavoriteUseCase
import com.otus.dihomework.features.favorites.FavoriteSubcomponent
import com.otus.dihomework.features.favorites.FavoriteSubcomponentModule
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class, AppModuleBinds::class, FavoriteSubcomponentModule::class])
interface AppComponent {

    @Component.Factory
    interface Factory {
        fun build(@BindsInstance context: Context): AppComponent
    }

    fun productApiService(): ProductApiService

    fun favoriteComponent(): FavoriteSubcomponent.Factory

    fun consumeProductsUseCase(): ConsumeProductsUseCase

    fun toggleFavoriteUseCase(): ToggleFavoriteUseCase

}