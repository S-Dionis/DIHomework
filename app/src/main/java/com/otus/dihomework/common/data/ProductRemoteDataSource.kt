package com.otus.dihomework.common.data

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class ProductRemoteDataSource @Inject constructor(val apiService: ProductApiService) {

    fun consumeProducts(): Flow<List<ProductDto>> = flow {
        emit(apiService.getProducts())
    }
}
