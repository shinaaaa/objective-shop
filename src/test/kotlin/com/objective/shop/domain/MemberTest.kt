package com.objective.shop.domain

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

internal class MemberTest {

    @Test
    @DisplayName("회원정보 구성 (아이디, 비밀번호, 잔액, 회원구분(회원/비회원), 회원 등급)")
    fun memberInfo() {
        val id = "1234"
        val password = "12345678"
        val rank = ""
        Member(id = id, password = password, rank = rank)
    }

    @Test
    @DisplayName("비밀번호가 8~20글자가 아닌경우 IllegalArgumentException 오류")
    fun `IllegalArgumentException error if invalid argument password is not 8-20 characters`() {
        val id = "1234"
        val password = "123"
        val rank = ""

        assertThrows<IllegalArgumentException> { Member(id = id, password = password, rank = rank) }
    }

    @Test
    @DisplayName("잔액 초기값 0")
    fun `Balance initial value 0`() {
        val id = "1234"
        val password = "12345678"
        val rank = ""

        val member = Member(id = id, password = password, rank = rank)

        Assertions.assertThat(member.point).isEqualTo(0)
    }
}
