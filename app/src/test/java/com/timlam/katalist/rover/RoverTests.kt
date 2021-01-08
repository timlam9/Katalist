package com.timlam.katalist.rover

import org.junit.Assert.assertEquals
import org.junit.Test

class RoverTests {

    private val rover = MarsRover()

    @Test
    fun `executing a movement command advances one spot on the grid towards the facing direction`() {
        val finalPosition = rover.execute("M")

        assertEquals("0:1:N", finalPosition)
    }

    @Test
    fun `executing a left rotation command advances changes the facing direction anti-clock wise`() {
        val finalPosition = rover.execute("L")

        assertEquals("0:0:W", finalPosition)
    }

    @Test
    fun `executing a right rotation command advances changes the facing direction clock wise`() {
        val finalPosition = rover.execute("R")

        assertEquals("0:0:E", finalPosition)
    }

    @Test
    fun `can execute a set of commands`() {
        val finalPosition = rover.execute("MMRMMLM")

        assertEquals("2:3:N", finalPosition)
    }

}

class MarsRover {

    fun execute(command: String): String {
        return if (command == "R") {
            "0:0:E"
        } else if (command == "L") {
            "0:0:W"
        } else {
            "0:1:N"
        }
    }

}
