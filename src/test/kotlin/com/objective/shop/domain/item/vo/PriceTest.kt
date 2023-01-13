package com.objective.shop.domain.item.vo

import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

class PriceTest {

    @Test
    @DisplayName("가격이 0보다 작은 경우 IllegalArgumentException 오류")
    fun `IllegalArgumentException error when price is less than 0`() {
        assertThrows<IllegalArgumentException> { Price.of(-1) }
    }
}
