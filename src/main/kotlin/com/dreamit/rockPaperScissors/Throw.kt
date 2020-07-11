package com.dreamit.rockPaperScissors

import com.dreamit.rockPaperScissors.ThrowResult.*

enum class Throw: Challenge {
    ROCK {
        override fun throwsAgainst(opponent: Throw): ThrowResult {
            return when(opponent) {
                ROCK -> TIE
                PAPER -> LOSS
                SCISSOR -> WIN
            }
        }
    },
    PAPER {
        override fun throwsAgainst(opponent: Throw): ThrowResult {
            return when(opponent) {
                ROCK -> WIN
                PAPER -> TIE
                SCISSOR -> LOSS
            }
        }
    },
    SCISSOR {
        override fun throwsAgainst(opponent: Throw): ThrowResult {
            return when(opponent) {
                ROCK -> LOSS
                PAPER -> WIN
                SCISSOR -> TIE
            }
        }
    }
}
