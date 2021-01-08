package com.timlam.katalist.rover

import junitparams.JUnitParamsRunner
import junitparams.Parameters
import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(JUnitParamsRunner::class)
class MarsRoverTests {

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

    @Test
    fun `adds a zero prefix when finding an obstacle on a move command`() {
        val rover = MarsRover(Grid(obstacles = listOf(Coordinates(0, 3))))
        val finalPosition = rover.execute("MMM")

        assertEquals("0:0:2:N", finalPosition)
    }

}
