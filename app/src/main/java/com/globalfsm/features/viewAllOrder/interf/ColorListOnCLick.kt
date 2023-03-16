package com.globalfsm.features.viewAllOrder.interf

import com.globalfsm.app.domain.NewOrderGenderEntity
import com.globalfsm.features.viewAllOrder.model.ProductOrder

interface ColorListOnCLick {
    fun colorListOnCLick(size_qty_list: ArrayList<ProductOrder>, adpPosition:Int)
}