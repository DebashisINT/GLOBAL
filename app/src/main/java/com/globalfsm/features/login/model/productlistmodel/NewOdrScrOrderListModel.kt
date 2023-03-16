package com.globalfsm.features.login.model.productlistmodel

import com.globalfsm.app.domain.NewOrderScrOrderEntity
import com.globalfsm.app.domain.ProductListEntity

class NewOdrScrOrderListModel {
    var status:String? = null
    var message:String? = null
    var user_id:String? = null
    var order_list: ArrayList<NewOrderScrOrderEntity>? = null
}