package com.breezefieldaereo.features.mylearning.apiCall

import com.breezefieldaereo.features.login.api.opportunity.OpportunityListApi
import com.breezefieldaereo.features.login.api.opportunity.OpportunityListRepo

object LMSRepoProvider {
    fun getTopicList(): LMSRepo {
        return LMSRepo(LMSApi.create())
    }
}