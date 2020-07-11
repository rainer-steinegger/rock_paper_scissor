package com.dreamit.rockPaperScissors.match

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class MatchupTest {
    companion object {
        private const val AMOUNT_OF_THROWS = 100
    }

    private val randomPlayer = RandomPlayer()
    private val stubbornRockPlayer = StubbornPlayer()
    private val matchup = Matchup(randomPlayer, stubbornRockPlayer)


    @Test
    fun `play rock paper scissors!`() {
        repeat(AMOUNT_OF_THROWS) { matchup.nextRound() }

        assertThat(matchup.summary.playerAWins + matchup.summary.playerBWins + matchup.summary.ties).isEqualTo(AMOUNT_OF_THROWS)
        matchup.printSummary()
    }
}
