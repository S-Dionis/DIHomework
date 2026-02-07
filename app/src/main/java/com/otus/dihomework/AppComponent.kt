package com.otus.dihomework

import android.content.Context
import com.otus.dihomework.common.data.ProductApiService
import com.otus.dihomework.common.data.ProductDomainMapper
import com.otus.dihomework.di.AppModule
import com.otus.dihomework.di.AppModuleBinds
import com.otus.dihomework.features.products.ProductsViewModelFactory
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class, AppModuleBinds::class])
interface AppComponent {

    @Component.Factory
    interface Factory {
        fun build(@BindsInstance context: Context): AppComponent
    }

    fun productApiService(): ProductApiService

    fun productDomainMapper(): ProductDomainMapper

    fun favoriteComponent(): FavoriteSubcomponent.Factory

    fun productsViewModelFactory(): ProductsViewModelFactory



}