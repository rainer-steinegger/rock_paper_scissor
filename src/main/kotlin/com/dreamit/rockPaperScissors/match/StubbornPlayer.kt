package com.dreamit.rockPaperScissors.match

import com.dreamit.rockPaperScissors.Throw
import com.dreamit.rockPaperScissors.Throw.ROCK

class StubbornPlayer(private val alwaysThrow: Throw = ROCK):
    Player {
    override fun name() = "Mr. ${alwaysThrow}-Stubborn"
    override fun nextThrow()= alwaysThrow
}
