package com.dreamit.rockPaperScissors.match

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class MatchupTest {
    companion object {
        private const val THROWS = 100
    }

    private val randomPlayer = RandomPlayer()
    private val stubbornRockPlayer = StubbornPlayer()
    private val matchup = Matchup(randomPlayer, stubbornRockPlayer)


    @Test
    fun `play rock paper scissors!`() {
        repeat(THROWS) { matchup.nextRound() }

        assertThat(matchup.playerAWins + matchup.playerBWins + matchup.ties).isEqualTo(THROWS)
    }
}
