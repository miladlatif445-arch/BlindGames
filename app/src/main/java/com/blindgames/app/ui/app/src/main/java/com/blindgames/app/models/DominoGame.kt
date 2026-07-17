package com.blindgames.app.game

import com.blindgames.app.models.DominoPlayer
import com.blindgames.app.models.DominoTile

class DominoGame {

    val players = mutableListOf<DominoPlayer>()

    val board = mutableListOf<DominoTile>()

    var currentPlayer = 0

    fun addPlayer(player: DominoPlayer) {
        players.add(player)
    }

    fun startGame() {
        board.clear()
        currentPlayer = 0

        players.forEach {
            it.clearTiles()
        }
    }

    fun nextPlayer() {
        if (players.isNotEmpty()) {
            currentPlayer = (currentPlayer + 1) % players.size
        }
    }

    fun currentPlayer(): DominoPlayer {
        return players[currentPlayer]
    }

    fun playTile(tile: DominoTile) {
        board.add(tile)
        currentPlayer().removeTile(tile)
    }
}
