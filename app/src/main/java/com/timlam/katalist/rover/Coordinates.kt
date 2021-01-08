package com.timlam.katalist.rover

data class Coordinates(
    val x: Int = 0,
    val y: Int = 0,
    val direction: MarsRover.Direction = MarsRover.Direction.North,
    val foundObstacle: Boolean = false
) {

    fun currentPosition(): String {
        val obstacle = if (foundObstacle) "0:" else ""
        return "$obstacle$x:$y:${direction.name.first()}"
    }

}