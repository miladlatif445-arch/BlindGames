package com.blindgames.app.models

data class DominoPlayer(

    val id: Int,

    val name: String,

    val isHuman: Boolean = false,

    var score: Int = 0,

    val tiles: MutableList<DominoTile> = mutableListOf()

) {

    fun addTile(tile: DominoTile) {
        tiles.add(tile)
    }

    fun removeTile(tile: DominoTile) {
        tiles.remove(tile)
    }

    fun tileCount(): Int {
        return tiles.size
    }

    fun totalPips(): Int {
        return tiles.sumOf { it.left + it.right }
    }

    fun clearTiles() {
        tiles.clear()
    }
}
