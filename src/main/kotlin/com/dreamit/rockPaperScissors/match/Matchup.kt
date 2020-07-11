package com.dreamit.rockPaperScissors.match

import com.dreamit.rockPaperScissors.ThrowResult.*

class Matchup(private val playerA: Player, private val playerB: Player) {

    var summary = Summary()

    fun nextRound() {
        val playerAThrow = playerA.nextThrow()
        val playerBThrow = playerB.nextThrow()

        val result = playerAThrow.throwsAgainst(playerBThrow)
        summary = when (result) {
            WIN -> summary.copy(playerAWins = summary.playerAWins + 1)
            LOSS -> summary.copy(playerBWins = summary.playerBWins + 1)
            TIE -> summary.copy(ties = summary.ties + 1)
        }

        println("$playerAThrow vs $playerBThrow and $result")
    }

    fun printSummary() {
        println("${playerA.name()} won ${summary.playerAWins} times")
        println("${playerB.name()} won ${summary.playerBWins} times")
        println("there were a total of ${summary.ties} ties")
    }
}
