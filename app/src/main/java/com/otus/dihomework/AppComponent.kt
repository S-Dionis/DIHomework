package com.otus.dihomework

import android.content.Context
import com.otus.dihomework.features.favorites.FavoriteSubcomponent
import com.otus.dihomework.features.favorites.FavoriteSubcomponentModule
import com.otus.dihomework.features.favorites.ProductsDependencies
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class, AppModuleBinds::class, FavoriteSubcomponentModule::class])
interface AppComponent: ProductsDependencies {

    @Component.Factory
    interface Factory {
        fun build(@BindsInstance context: Context): AppComponent
    }

    fun favoriteComponent(): FavoriteSubcomponent.Factory

}