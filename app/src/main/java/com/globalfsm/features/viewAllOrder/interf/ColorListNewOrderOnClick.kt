package com.globalfsm.features.viewAllOrder.interf

import com.globalfsm.app.domain.NewOrderColorEntity
import com.globalfsm.app.domain.NewOrderProductEntity

interface ColorListNewOrderOnClick {
    fun productListOnClick(color: NewOrderColorEntity)
}