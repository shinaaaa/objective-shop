package com.objective.shop.domain.item.vo

import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

internal class QuantityTest {

    @Test
    @DisplayName("0보다 작은 숫자를 넣을 경우 IllegalArgumentException 오류")
    fun `IllegalArgumentException error if a number less than 0 is inserted`() {
        assertThrows<IllegalArgumentException> { Quantity.of(-1) }
    }
}
