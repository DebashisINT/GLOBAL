package com.globalfsm.features.photoReg.present

import com.globalfsm.app.domain.ProspectEntity
import com.globalfsm.features.photoReg.model.UserListResponseModel

interface DsStatusListner {
    fun getDSInfoOnLick(obj: ProspectEntity)
}