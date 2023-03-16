package com.globalfsm.features.viewAllOrder.interf

import com.globalfsm.app.domain.NewOrderGenderEntity
import com.globalfsm.app.domain.NewOrderProductEntity

interface ProductListNewOrderOnClick {
    fun productListOnClick(product: NewOrderProductEntity)
}