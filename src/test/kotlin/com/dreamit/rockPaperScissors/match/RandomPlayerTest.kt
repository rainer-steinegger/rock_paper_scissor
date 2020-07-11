package com.dreamit.rockPaperScissors.match

import com.dreamit.rockPaperScissors.Throw.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class RandomPlayerTest {
    private val player = RandomPlayer()

    @Test
    fun `has the correct name`() {
        assertThat(player.name()).isEqualTo("Mr. Random")
    }

    @Test
    fun `the random player uses all throws`() {
        val distinctThrows = (0..100).map { player.nextThrow() }.toSet()

        assertThat(distinctThrows).containsExactlyInAnyOrder(ROCK, PAPER, SCISSOR)
    }
}
