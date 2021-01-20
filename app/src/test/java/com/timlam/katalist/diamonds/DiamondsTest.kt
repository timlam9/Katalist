package com.timlam.katalist.diamonds

import com.timlam.katalist.exercises.diamond.Diamond
import org.junit.Assert.assertEquals
import org.junit.Test
import java.lang.Exception

class DiamondsTest {

    val diamond = Diamond()

    @Test
    fun `when letter is A, then print A`() {
        val letter = 'A'

        val result = diamond(letter)

        assertEquals(result, letter.toString())
    }

    @Test
    fun `when letter is B, then print diamond B`() {
        val letter = 'B'
        val expectedDiamond = "A\n" +
                "B B\n" +
                "A"

        val result = diamond(letter)

        assertEquals(result, expectedDiamond)
    }

    @Test
    fun `when letter is C, then print diamond C`() {
        val letter = 'C'
        val expectedDiamond = "A\n" +
                "B B\n" +
                "C   C\n" +
                "B B\n" +
                "A"

        val result = diamond(letter)

        assertEquals(result, expectedDiamond)
    }

    @Test
    fun `when letter is D, then print diamond D`() {
        val letter = 'D'
        val expectedDiamond = "A\n" +
                "B B\n" +
                "C   C\n" +
                "D     D\n" +
                "C   C\n" +
                "B B\n" +
                "A"

        val result = diamond(letter)

        assertEquals(result, expectedDiamond)
    }

}
