package com.objective.shop.domain.member.vo

import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

internal class PasswordTest {

    @Test
    @DisplayName("비밀번호가 8~20글자가 아닌경우 IllegalArgumentException 오류")
    fun `IllegalArgumentException error if invalid argument password is not 8-20 characters`() {
        val password = "123"

        assertThrows<IllegalArgumentException> { Password.of(password) }
    }
}
