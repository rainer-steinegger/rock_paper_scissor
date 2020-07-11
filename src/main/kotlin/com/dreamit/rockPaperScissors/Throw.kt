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
        override fun toString(): String {
            return "✊"
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
        override fun toString(): String {
            return "✋"
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
        override fun toString(): String {
            return "✌"
        }
    }
}
