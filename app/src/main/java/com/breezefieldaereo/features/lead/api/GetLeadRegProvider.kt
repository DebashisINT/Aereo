package com.breezefieldaereo.features.lead.api

import com.breezefieldaereo.features.NewQuotation.api.GetQuotListRegRepository
import com.breezefieldaereo.features.NewQuotation.api.GetQutoListApi


object GetLeadRegProvider {
    fun provideList(): GetLeadListRegRepository {
        return GetLeadListRegRepository(GetLeadListApi.create())
    }
}