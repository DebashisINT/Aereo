package com.breezefieldaereo.features.location.api

import com.breezefieldaereo.features.location.shopdurationapi.ShopDurationApi
import com.breezefieldaereo.features.location.shopdurationapi.ShopDurationRepository


object LocationRepoProvider {
    fun provideLocationRepository(): LocationRepo {
        return LocationRepo(LocationApi.create())
    }
}