package com.dreamit.rockPaperScissors.match

import com.dreamit.rockPaperScissors.Throw

interface Player {
    fun name(): String
    fun nextThrow(): Throw
}
