package com.timlam.katalist.exercises.diamond

class Diamond {

    operator fun invoke(letter: Char): String {
        if (letter == 'A') return letter.toString()

        var diamond = "A"
        diamond += ('B' until letter).joinToString("") {
            it.buildLine()
        }
        val bottomHalf = diamond.reversed()
        diamond += letter.buildLine() + newLine + bottomHalf

        return diamond
    }

    fun generateSpaces(number: Int): String {
        var spaces = ""
        repeat(number) {
            spaces += " "
        }
        return spaces
    }

    fun Char.buildLine(): String = newLine + this + generateSpaces((this - 'A') * 2 - 1) + this

    companion object {

        const val newLine = "\n"
    }

}
