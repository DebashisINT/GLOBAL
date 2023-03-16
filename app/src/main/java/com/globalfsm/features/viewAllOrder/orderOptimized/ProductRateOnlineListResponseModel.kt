package com.globalfsm.features.viewAllOrder.orderOptimized

import com.globalfsm.app.domain.ProductOnlineRateTempEntity
import com.globalfsm.base.BaseResponse
import com.globalfsm.features.login.model.productlistmodel.ProductRateDataModel
import java.io.Serializable

class ProductRateOnlineListResponseModel: BaseResponse(), Serializable {
    var product_rate_list: ArrayList<ProductOnlineRateTempEntity>? = null
}