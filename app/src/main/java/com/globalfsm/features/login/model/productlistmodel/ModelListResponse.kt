package com.globalfsm.features.login.model.productlistmodel

import com.globalfsm.app.domain.ModelEntity
import com.globalfsm.app.domain.ProductListEntity
import com.globalfsm.base.BaseResponse

class ModelListResponse: BaseResponse() {
    var model_list: ArrayList<ModelEntity>? = null
}