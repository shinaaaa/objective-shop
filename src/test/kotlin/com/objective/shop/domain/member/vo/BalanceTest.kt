package com.objective.shop.domain.member.vo

import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

internal class BalanceTest {

    @Test
    @DisplayName("잔액 0보다 작은 경우 IllegalArgumentException 오류")
    fun `IllegalArgumentException error when price is less than 0`() {
        assertThrows<IllegalArgumentException> { Balance.of(-1) }
    }
}
