package com.timlam.katalist.tennis

import com.timlam.katalist.exercises.tennis.TennisScoreCalculator
import org.junit.Assert.assertEquals
import org.junit.Test

class TennisScoreCalculatorTest {

    private val tennisScoreCalculator = TennisScoreCalculator()

    @Test
    fun `given at least four points on player 1, when score is 4-2, then the game is won by the first player`() {
        val result = tennisScoreCalculator.score(4, 2)

        assertEquals(result, "Player 1 won the game")
    }


    @Test
    fun `given at least four points on player 1, when score is 4-3, then the score is advantage forty`() {
        val result = tennisScoreCalculator.score(4, 3)

        assertEquals(result, "advantage-forty")
    }

    @Test
    fun `given at least four points on player 2, when score is 2-4, then the game is won by the second player`() {
        val result = tennisScoreCalculator.score(2, 4)

        assertEquals(result, "Player 2 won the game")
    }

    @Test
    fun `given at least four points on player 2, when score is 3-4, then the score is forty advantage`() {
        val result = tennisScoreCalculator.score(3, 4)

        assertEquals(result, "forty-advantage")
    }

    @Test
    fun `when score is 0-0, then score is love love`() {
        val result = tennisScoreCalculator.score(0, 0)

        assertEquals(result, "love-love")
    }

    @Test
    fun `when score is 1-1, then score is fifteen-fifteen`() {
        val result = tennisScoreCalculator.score(1, 1)

        assertEquals(result, "fifteen-fifteen")
    }

    @Test
    fun `when score is 2-2, then score is thirty-thirty`() {
        val result = tennisScoreCalculator.score(2, 2)

        assertEquals(result, "thirty-thirty")
    }

    @Test
    fun `given score is equal and at least 3 points, when scoring, then score is deuce`() {
        val result = tennisScoreCalculator.score(3, 3)

        assertEquals(result, "deuce")
    }

    @Test
    fun `given player 1 and player 2 score is at least 3 points, when first player scores a point, then player 1 score is advantage`() {
        val result = tennisScoreCalculator.score(4, 3)

        assertEquals(result, "advantage-forty")
    }

    @Test
    fun `given player 1 and player 2 score is at least 3 points, when second player scores a point, then player 2 score is advantage`() {
        val result = tennisScoreCalculator.score(4, 5)

        assertEquals(result, "forty-advantage")
    }

}

