package com.breezefieldaereo.features.document.api

import com.breezefieldaereo.features.dymanicSection.api.DynamicApi
import com.breezefieldaereo.features.dymanicSection.api.DynamicRepo

object DocumentRepoProvider {
    fun documentRepoProvider(): DocumentRepo {
        return DocumentRepo(DocumentApi.create())
    }

    fun documentRepoProviderMultipart(): DocumentRepo {
        return DocumentRepo(DocumentApi.createImage())
    }
}