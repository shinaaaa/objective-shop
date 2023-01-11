package com.objective.shop.domain

class Member(val id: String, val password: String, val point: Int = 0, val rank: String) {

    init {
        require((password.length in 8..20)) { "비밀번호 길이가 8~20글자가 아닙니다." }
    }
}
