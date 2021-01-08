package com.timlam.katalist.rover

class Grid(
    val height: Int = 10,
    val width: Int = 10,
    private val obstacles: List<Coordinates> = emptyList()
) {

    enum class Spot {
        Free,
        Obstacle
    }

    private val list: List<List<Spot>> = generate()

    private fun generate(): List<List<Spot>> {
        val list = mutableListOf<List<Spot>>()
        (0..height).map { heightIndex ->
            list.add((0..width).map { widthIndex ->
                if (obstacles.any { it.y == heightIndex && it.x == widthIndex }) Spot.Obstacle else Spot.Free
            })
        }

        return list
    }

    fun isFreeSpot(x: Int, y: Int): Boolean = list[y][x] == Spot.Free

}
