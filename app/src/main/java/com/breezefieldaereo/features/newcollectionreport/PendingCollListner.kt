package com.breezefieldaereo.features.newcollectionreport

import com.breezefieldaereo.features.photoReg.model.UserListResponseModel

interface PendingCollListner {
    fun getUserInfoOnLick(obj: PendingCollData)
}