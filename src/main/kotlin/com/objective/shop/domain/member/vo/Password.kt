package com.objective.shop.domain.member.vo

@JvmInline
value class Password(val value: String) {

    companion object {
        fun of(value: String): Password {
            require((value.length in 8..20)) { "비밀번호 길이가 8~20글자가 아닙니다." }
            return Password(value)
        }
    }
}
