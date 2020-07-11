package com.dreamit.rockPaperScissors.match

import com.dreamit.rockPaperScissors.ThrowResult.*

class Matchup(private val playerA: Player, private val playerB: Player) {

    var playerAWins = 0
    var playerBWins = 0
    var ties = 0

    fun nextRound() {
        val playerAThrow = playerA.nextThrow()
        val playerBThrow = playerB.nextThrow()

        val result = playerAThrow.throwsAgainst(playerBThrow)
        when (result) {
            WIN -> playerAWins++
            LOSS -> playerBWins++
            TIE -> ties++
        }

        println("$playerAThrow vs $playerBThrow and $result")
    }
}
