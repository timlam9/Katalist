package com.timlam.katalist.rover

data class Coordinates(
    val x: Int = 0,
    val y: Int = 0
) {

    fun currentPosition(direction: Char, obstaclePrefix: String) = "$obstaclePrefix$x:$y:$direction"

}
