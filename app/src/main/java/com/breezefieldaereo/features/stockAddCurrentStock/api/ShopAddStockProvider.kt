package com.breezefieldaereo.features.stockAddCurrentStock.api

import com.breezefieldaereo.features.location.shopRevisitStatus.ShopRevisitStatusApi
import com.breezefieldaereo.features.location.shopRevisitStatus.ShopRevisitStatusRepository

object ShopAddStockProvider {
    fun provideShopAddStockRepository(): ShopAddStockRepository {
        return ShopAddStockRepository(ShopAddStockApi.create())
    }
}