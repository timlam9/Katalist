package com.timlam.katalist.rover

import junitparams.JUnitParamsRunner
import junitparams.Parameters
import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(JUnitParamsRunner::class)
class RoverTests {

    private val rover = MarsRover()

    @Test
    fun `executing a movement command advances one spot on the grid towards the facing direction`() {
        val finalPosition = rover.execute("M")

        assertEquals("0:1:N", finalPosition)
    }

    @Test
    @Parameters(
        "L, 0:0:W",
        "LL, 0:0:S",
        "LLL, 0:0:E",
        "LLLL, 0:0:N",
    )
    fun `executing a left rotation command advances changes the facing direction anti-clock wise`(
        command: String,
        position: String
    ) {
        val finalPosition = rover.execute(command)

        assertEquals(position, finalPosition)
    }

    @Test
    @Parameters(
        "R, 0:0:E",
        "RR, 0:0:S",
        "RRR, 0:0:W",
        "RRRR, 0:0:N",
    )
    fun `executing a right rotation command advances changes the facing direction clock wise`(
        command: String,
        position: String
    ) {
        val finalPosition = rover.execute(command)

        assertEquals(position, finalPosition)
    }

    @Test
    fun `can execute a set of commands`() {
        val finalPosition = rover.execute("MMRMMLM")

        assertEquals("2:3:N", finalPosition)
    }

    @Test
    @Parameters(
        "MMMMMMMMMM, 0:0:N",
        "RMMMMMMMMMM, 0:0:E",
        "RRMMMMMMMMMM, 0:0:S",
        "RRRMMMMMMMMMM, 0:0:W",
        "MMMMMMMMMLLMMMMMMMMMM, 0:9:S",
    )
    fun `wraps around if it reaches the end of the grid`(
        command: String,
        position: String
    ) {
        val finalPosition = rover.execute("MMMMMMMMMM")

        assertEquals("0:0:N", finalPosition)
    }

}

class MarsRover {

    companion object {

        private const val GRID_HEIGHT = 10
        private const val GRID_WIDTH = 10

        private const val RIGHT_COMMAND = 'R'
        private const val LEFT_COMMAND = 'L'

    }

    enum class Direction {
        North,
        East,
        South,
        West
    }

    data class Coordinates(val x: Int = 0, val y: Int = 0, val direction: Direction = Direction.North) {

        fun currentPosition() = "$x:$y:${direction.name.first()}"

    }

    private var coordinates = Coordinates()

    fun execute(command: String): String {
        command.forEach { singleCommand ->
            coordinates = when (singleCommand) {
                RIGHT_COMMAND -> coordinates.copy(direction = Direction.values()[findIndex(true)])
                LEFT_COMMAND -> coordinates.copy(direction = Direction.values()[findIndex(false)])
                else -> move()
            }
        }

        return coordinates.currentPosition()
    }

    private fun findIndex(clockWise: Boolean): Int {
        return if (clockWise) {
            if (coordinates.direction.ordinal != Direction.values().size - 1) coordinates.direction.ordinal + 1 else 0
        } else {
            if (coordinates.direction.ordinal != 0) coordinates.direction.ordinal - 1 else Direction.values().size - 1
        }
    }

    private fun move(): Coordinates {
        return when (coordinates.direction) {
            Direction.North -> coordinates.copy(y = if (coordinates.y == GRID_HEIGHT - 1) 0 else coordinates.y + 1)
            Direction.East -> coordinates.copy(x = if (coordinates.x == GRID_WIDTH - 1) 0 else coordinates.x + 1)
            Direction.South -> coordinates.copy(y = if (coordinates.y == 0) GRID_HEIGHT - 1 else coordinates.y - 1)
            Direction.West -> coordinates.copy(x = if (coordinates.x == 0) GRID_WIDTH - 1 else coordinates.x - 1)
        }
    }


}
