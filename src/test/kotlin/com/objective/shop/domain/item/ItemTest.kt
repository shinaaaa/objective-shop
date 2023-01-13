package com.objective.shop.domain.item

import com.objective.shop.domain.item.vo.Price
import com.objective.shop.domain.item.vo.Quantity
import com.objective.shop.domain.item.vo.Type
import org.assertj.core.api.Assertions
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

internal class ItemTest {

    @Test
    @DisplayName("상품정보 구성 (상품명, 판매가, 분류, 입고일자, 수량, 발주일자)")
    fun itemInfo() {
        val name = "샴푸"
        val price = Price.of(1_000)
        val type = Type.HAIR
        val quantity = Quantity.of(10)
        Item(name = name, price = price, type = type, quantity = quantity)
    }

    @Test
    @DisplayName("수량 초기값은 0")
    fun `Initial quantity value is 0`() {
        val name = "샴푸"
        val price = Price.of(1_000)
        val type = Type.HAIR
        val item = Item(name = name, price = price, type = type)

        Assertions.assertThat(item.quantity.value).isEqualTo(0)
    }
}
