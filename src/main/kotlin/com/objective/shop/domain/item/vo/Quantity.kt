package com.objective.shop.domain.item.vo

@JvmInline
value class Quantity private constructor(val value: Int) {

    companion object {
        fun of(value: Int): Quantity {
            require(value >= MIN_VALUE) { "최소 수량 ${MIN_VALUE}보다 미만일 수 없습니다." }

            return Quantity(value)
        }

        private const val MIN_VALUE = 0
    }
}
