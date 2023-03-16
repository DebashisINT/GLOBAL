package com.globalfsm.features.viewAllOrder.interf

import com.globalfsm.app.domain.NewOrderProductEntity
import com.globalfsm.app.domain.NewOrderSizeEntity

interface SizeListNewOrderOnClick {
    fun sizeListOnClick(size: NewOrderSizeEntity)
}