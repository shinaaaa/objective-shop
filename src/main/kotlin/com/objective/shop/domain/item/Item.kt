package com.objective.shop.domain.item

import com.objective.shop.domain.item.vo.Price
import com.objective.shop.domain.item.vo.Quantity
import com.objective.shop.domain.item.vo.Type
import java.time.LocalDateTime

class Item(
    val name: String,
    val price: Price,
    val type: Type,
    val quantity: Quantity = Quantity.of(0),
    val time: LocalDateTime = LocalDateTime.now()
)
