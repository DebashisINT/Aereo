package com.breezefieldaereo.features.photoReg.present

import com.breezefieldaereo.app.domain.ProspectEntity
import com.breezefieldaereo.features.photoReg.model.UserListResponseModel

interface DsStatusListner {
    fun getDSInfoOnLick(obj: ProspectEntity)
}