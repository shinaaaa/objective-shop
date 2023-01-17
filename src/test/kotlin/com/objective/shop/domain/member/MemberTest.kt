package com.objective.shop.domain.member

import com.objective.shop.domain.member.vo.Password
import com.objective.shop.domain.member.vo.Rank
import org.assertj.core.api.Assertions
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

internal class MemberTest {

    @Test
    @DisplayName("회원정보 구성 (아이디, 비밀번호, 잔액, 회원구분(회원/비회원), 회원 등급)")
    fun memberInfo() {
        val id = "1234"
        val password = Password.of("12345678")
        Member(id = id, password = password)
    }

    @Test
    @DisplayName("잔액 초기값 0")
    fun `Balance initial value 0`() {
        val id = "1234"
        val password = Password.of("12345678")

        val member = Member(id = id, password = password)

        Assertions.assertThat(member.balance.value).isEqualTo(0)
    }

    @Test
    @DisplayName("등급 초기값은 BRONZE")
    fun `Rank initial value BRONZE`() {
        val id = "1234"
        val password = Password.of("12345678")

        val member = Member(id = id, password = password)

        Assertions.assertThat(member.rank).isEqualTo(Rank.BRONZE)
    }
}
