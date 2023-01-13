package com.objective.shop.domain.item.vo

import java.math.BigDecimal

@JvmInline
value class Price private constructor(val value: BigDecimal) {

    companion object {

        fun of(value: Int): Price {
            require(value >= MIN_VALUE) { "최소 수량 ${MIN_VALUE}보다 미만일 수 없습니다." }

            return Price(value.toBigDecimal())
        }

        private const val MIN_VALUE: Int = 0
    }
}
