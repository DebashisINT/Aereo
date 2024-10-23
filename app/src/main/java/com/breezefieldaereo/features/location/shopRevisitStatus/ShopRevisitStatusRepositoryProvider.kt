package com.breezefieldaereo.features.location.shopRevisitStatus

import com.breezefieldaereo.features.location.shopdurationapi.ShopDurationApi
import com.breezefieldaereo.features.location.shopdurationapi.ShopDurationRepository

object ShopRevisitStatusRepositoryProvider {
    fun provideShopRevisitStatusRepository(): ShopRevisitStatusRepository {
        return ShopRevisitStatusRepository(ShopRevisitStatusApi.create())
    }
}