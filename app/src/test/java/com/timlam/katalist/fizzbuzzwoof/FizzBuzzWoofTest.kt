package com.timlam.katalist.fizzbuzzwoof

import com.timlam.katalist.exercises.fizzbuzzwoof.FizzBuzzWoof
import org.junit.Assert.assertEquals
import org.junit.Test

class FizzBuzzWoofTest {

    private val fizzBuzzWoof = FizzBuzzWoof()

    @Test
    fun `when number is not multiple of 3, 5 and 7, then print number`() {
        val result = fizzBuzzWoof.print(1)

        assertEquals(result, "1")
    }

    @Test
    fun `when number is multiple of 3, then print Fizz`() {
        val result = fizzBuzzWoof.print(3)

        assertEquals(result, "Fizz")
    }

    @Test
    fun `when number is multiple of 5, then print Buzz`() {
        val result = fizzBuzzWoof.print(5)

        assertEquals(result, "Buzz")
    }

    @Test
    fun `when number is multiple of 7, then print woof`() {
        val result = fizzBuzzWoof.print(7)

        assertEquals(result, "Woof")
    }

    @Test
    fun `when number is multiple of 3 and 5, then print FizzBuzz`() {
        val result = fizzBuzzWoof.print(15)

        assertEquals(result, "FizzBuzz")
    }

    @Test
    fun `when number is multiple of 3 and 7, then print FizzWoof`() {
        val result = fizzBuzzWoof.print(21)

        assertEquals(result, "FizzWoof")
    }

    @Test
    fun `when number is multiple of 5 and 7, then print BuzzWoof`() {
        val result = fizzBuzzWoof.print(35)

        assertEquals(result, "BuzzWoof")
    }

    @Test
    fun `when number is multiple of 3, 5 and 7, then print FizzBuzzWoof`() {
        val result = fizzBuzzWoof.print(210)

        assertEquals(result, "FizzBuzzWoof")
    }

}

