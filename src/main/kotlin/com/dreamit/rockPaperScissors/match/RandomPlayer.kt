package com.dreamit.rockPaperScissors.match

import com.dreamit.rockPaperScissors.Throw

class RandomPlayer: Player {
    override fun name() = "Mr. Random"
    override fun nextThrow() = Throw.values().random()
}
