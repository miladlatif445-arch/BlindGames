package com.blindgames.app.models

data class DominoTile(
    val left: Int,
    val right: Int,
    var played: Boolean = false
) {

    fun total(): Int {
        return left + right
    }

    fun isDouble(): Boolean {
        return left == right
    }

    fun flipped(): DominoTile {
        return DominoTile(
            right,
            left,
            played
        )
    }
}
