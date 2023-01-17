package com.objective.shop.domain.member.vo

@JvmInline
value class Balance(val value: Int) {

    companion object {
        fun of(value: Int): Balance {
            require(value >= MIN_VALUE) { "최소 잔액 ${MIN_VALUE}보다 미만일 수 없습니다." }

            return Balance(value)
        }

        private const val MIN_VALUE = 0
    }
}
