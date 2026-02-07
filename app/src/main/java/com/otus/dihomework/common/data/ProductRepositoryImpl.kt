package com.otus.dihomework.common.data

import com.otus.dihomework.common.domain_impl.ProductRepository
import com.otus.dihomework.common.domain_api.Product
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject

class ProductRepositoryImpl @Inject constructor(val mapper: ProductDomainMapper, val remoteDataSource: ProductRemoteDataSource) : ProductRepository {

    override fun consumeProducts(): Flow<List<Product>> {
        return remoteDataSource.consumeProducts()
            .map { dtos -> dtos.map(mapper::fromDto) }
    }
}
