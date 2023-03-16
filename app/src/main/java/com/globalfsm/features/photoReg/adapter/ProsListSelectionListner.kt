package com.globalfsm.features.photoReg.adapter

import com.globalfsm.features.photoReg.model.ProsCustom
import com.globalfsm.features.photoReg.model.UserListResponseModel

interface ProsListSelectionListner {
    fun getInfo(obj: ProsCustom)
}