package com.blindgames.app.game

import com.blindgames.app.models.DominoPlayer
import com.blindgames.app.models.DominoTile

class DominoEngine {

    private val tiles = mutableListOf<DominoTile>()

    fun createTiles() {
        tiles.clear()

        for (left in 0..6) {
            for (right in left..6) {
                tiles.add(DominoTile(left, right))
            }
        }
    }

    fun getTiles(): List<DominoTile> {
        return tiles
    }

    fun distributeTiles(players: List<DominoPlayer>) {
        createTiles()

        val shuffled = tiles.shuffled()

        players.forEach {
            it.clearTiles()
        }

        var index = 0

        while (index < shuffled.size) {
            players[index % players.size].addTile(shuffled[index])
            index++
        }
    }

    fun shuffleTiles() {
        tiles.shuffle()
    }

    fun remainingTiles(): Int {
        return tiles.size
    }
}
