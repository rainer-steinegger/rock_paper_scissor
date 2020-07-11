package com.dreamit.rockPaperScissors.match

import com.dreamit.rockPaperScissors.Throw.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class StubbornPlayerTest {
    private val player = StubbornPlayer()

    @Test
    fun `has the correct default name`() {
        assertThat(player.name()).isEqualTo("Mr. ROCK-Stubborn")
    }

    @Test
    fun `has the correct name when overriding the default throw`() {
        assertThat(StubbornPlayer(SCISSOR).name()).isEqualTo("Mr. SCISSOR-Stubborn")
    }

    @Test
    fun `the random player uses all throws`() {
        val distinctThrows = (0..100).map { player.nextThrow() }.toSet()

        assertThat(distinctThrows).containsOnly(ROCK)
    }
}
