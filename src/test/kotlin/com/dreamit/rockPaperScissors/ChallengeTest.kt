package com.dreamit.rockPaperScissors

import com.dreamit.rockPaperScissors.ThrowResult.*
import com.dreamit.rockPaperScissors.Throw.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ChallengeTest {

    @Test
    fun `rock permutations`() {
        assertThat(ROCK.throwsAgainst(ROCK)).isEqualTo(TIE)
        assertThat(ROCK.throwsAgainst(PAPER)).isEqualTo(LOSS)
        assertThat(ROCK.throwsAgainst(SCISSOR)).isEqualTo(WIN)
    }

    @Test
    fun `paper permutations`() {
        assertThat(PAPER.throwsAgainst(ROCK)).isEqualTo(WIN)
        assertThat(PAPER.throwsAgainst(PAPER)).isEqualTo(TIE)
        assertThat(PAPER.throwsAgainst(SCISSOR)).isEqualTo(LOSS)
    }

    @Test
    fun `scissor permutations`() {
        assertThat(SCISSOR.throwsAgainst(ROCK)).isEqualTo(LOSS)
        assertThat(SCISSOR.throwsAgainst(PAPER)).isEqualTo(WIN)
        assertThat(SCISSOR.throwsAgainst(SCISSOR)).isEqualTo(TIE)
    }
}
