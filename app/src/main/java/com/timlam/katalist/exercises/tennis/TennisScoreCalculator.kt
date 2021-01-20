package com.timlam.katalist.exercises.tennis

class TennisScoreCalculator {

    companion object {

        private const val PLAYER_1_WON = "Player 1 won the game"
        private const val PLAYER_2_WON = "Player 2 won the game"

    }

    private val possibleScores = mapOf<Int, String>(
        0 to "love",
        1 to "fifteen",
        2 to "thirty",
        3 to "forty"
    )

    fun score(player1Points: Int, player2Points: Int): String {
        val scoreResult1 = resolvePlayerPoints(player1Points)
        val scoreResult2 = resolvePlayerPoints(player2Points)

        return when {
            player1Points >= 3 && player1Points == player2Points -> "deuce"
            player1Points > player2Points -> "advantage-forty"
            player1Points < player2Points -> "forty-advantage"
            player1Points >= 4 && player1Points - player2Points >= 2 -> PLAYER_1_WON
            player2Points >= 4 && player2Points - player1Points >= 2 -> PLAYER_2_WON
            else -> "$scoreResult1-$scoreResult2"
        }
    }

    private fun resolvePlayerPoints(playerPoints: Int): String {
        return if (possibleScores.keys.contains(playerPoints)) {
            possibleScores[playerPoints] as String
        } else {
            possibleScores[0] as String
        }
    }

}
