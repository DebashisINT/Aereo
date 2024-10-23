package com.breezefieldaereo.features.survey.api

import com.breezefieldaereo.features.photoReg.api.GetUserListPhotoRegApi
import com.breezefieldaereo.features.photoReg.api.GetUserListPhotoRegRepository

object SurveyDataProvider{

    fun provideSurveyQ(): SurveyDataRepository {
        return SurveyDataRepository(SurveyDataApi.create())
    }

    fun provideSurveyQMultiP(): SurveyDataRepository {
        return SurveyDataRepository(SurveyDataApi.createImage())
    }
}