package com.objective.shop.domain.member

import com.objective.shop.domain.member.vo.Balance
import com.objective.shop.domain.member.vo.Password
import com.objective.shop.domain.member.vo.Rank

class Member(val id: String, val password: Password, val balance: Balance = Balance.of(0), val rank: Rank = Rank.BRONZE)
