package com.otus.dihomework.features.products

import com.otus.dihomework.AppComponent
import com.otus.dihomework.common.di.FeatureScope
import dagger.Component

@FeatureScope
@Component(
    dependencies = [AppComponent::class],
    modules = [ProductModule::class]
)
interface ProductsComponent {

    @Component.Factory
    interface Factory {
        fun create(appComponent: AppComponent): ProductsComponent
    }
    fun productsViewModelFactory(): ProductsViewModelFactory

}