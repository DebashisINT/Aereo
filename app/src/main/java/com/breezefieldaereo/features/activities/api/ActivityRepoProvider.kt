package com.breezefieldaereo.features.activities.api

import com.breezefieldaereo.features.member.api.TeamApi
import com.breezefieldaereo.features.member.api.TeamRepo

object ActivityRepoProvider {
    fun activityRepoProvider(): ActivityRepo {
        return ActivityRepo(ActivityApi.create())
    }

    fun activityImageRepoProvider(): ActivityRepo {
        return ActivityRepo(ActivityApi.createImage())
    }
}