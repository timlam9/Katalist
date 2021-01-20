package com.timlam.katalist.exercises.fizzbuzzwoof

class FizzBuzzWoof {

    companion object {

        private const val FIZZ = "Fizz"
        private const val BUZZ = "Buzz"
        private const val WOOF = "Woof"
    }

    fun print(number: Int) = listOf(::fizz, ::buzz, ::woof).joinToString("") {
        it.invoke(number)
    }.ifEmpty {
        number.toString()
    }

    private fun Int.isMultipleOf(number: Int): Boolean = this.rem(number) == 0

    private fun fizz(number: Int): String = number.buildWord(3, FIZZ)

    private fun buzz(number: Int): String = number.buildWord(5, BUZZ)

    private fun woof(number: Int): String = number.buildWord(7, WOOF)

    private fun Int.buildWord(number: Int, word: String) = if (this.isMultipleOf(number)) word else ""

}
