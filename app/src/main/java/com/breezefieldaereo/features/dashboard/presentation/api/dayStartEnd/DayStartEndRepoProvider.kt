package com.breezefieldaereo.features.dashboard.presentation.api.dayStartEnd

import com.breezefieldaereo.features.stockCompetetorStock.api.AddCompStockApi
import com.breezefieldaereo.features.stockCompetetorStock.api.AddCompStockRepository

object DayStartEndRepoProvider {
    fun dayStartRepositiry(): DayStartEndRepository {
        return DayStartEndRepository(DayStartEndApi.create())
    }

}