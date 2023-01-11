package com.objective.shop.domain

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

internal class ItemTest {

    @Test
    @DisplayName("상품정보 구성 (상품명, 판매가, 분류, 입고일자, 수량, 발주일자)")
    fun itemInfo() {
        val name = "샴푸"
        val price = 1_000
        val type = "헤어"
        val quantity = 10
        val time = "202301111000"
        Item(name = name, price = price, type = type, quantity = quantity, time = time)
    }

    @Test
    @DisplayName("수량 초기값은 0")
    fun `Initial quantity value is 0`() {
        val name = "샴푸"
        val price = 1_000
        val type = "헤어"
        val time = "202301111000"
        val item = Item(name = name, price = price, type = type, time = time)

        Assertions.assertThat(item.quantity).isEqualTo(0)
    }
}
