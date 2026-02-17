package com.otus.dihomework.features.products

import com.otus.dihomework.common.di.FeatureScope
import com.otus.dihomework.features.favorites.ProductsDependencies
import dagger.Component

@FeatureScope
@Component(
    dependencies = [ProductsDependencies::class],
)
interface ProductsComponent {

    @Component.Factory
    interface Factory {
        fun create(appComponent: ProductsDependencies): ProductsComponent
    }

    fun productsViewModelFactory(): ProductsViewModelFactory

}