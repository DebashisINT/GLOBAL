package com.globalfsm.features.viewAllOrder.model

import com.globalfsm.app.domain.NewOrderColorEntity
import com.globalfsm.app.domain.NewOrderGenderEntity
import com.globalfsm.app.domain.NewOrderProductEntity
import com.globalfsm.app.domain.NewOrderSizeEntity
import com.globalfsm.features.stockCompetetorStock.model.CompetetorStockGetDataDtls

class NewOrderDataModel {
    var status:String ? = null
    var message:String ? = null
    var Gender_list :ArrayList<NewOrderGenderEntity>? = null
    var Product_list :ArrayList<NewOrderProductEntity>? = null
    var Color_list :ArrayList<NewOrderColorEntity>? = null
    var size_list :ArrayList<NewOrderSizeEntity>? = null
}

