package com.timlam.katalist.domain

import com.timlam.katalist.R
import com.timlam.katalist.domain.models.Kata

object KatasRepository {

    val katas: List<Kata> = arrayListOf(
        Kata(
            title = "Fizz Buzz Woof",
            image = R.drawable.fizz_buzz_woof,
            info = "Loop from 1 to 100. The number 3 - Fizz, 5 - Buzz, and 7 - Woof. The main rules in this game are that any number that CONTAINS the number or is DIVISIBLE by that number is replaced by an occurrence of the word. If the number has 2 instances of that number (i.e. 33 or 55) and is divisible by that number, then the word is said three times in this example. The additional rule is that the words (if more than one occur) must be said in the order given in the title.\n" +
                    "\n" +
                    "For example:\n" +
                    "\n" +
                    "1, 2, Fizz Fizz (3), 4, Buzz Buzz (5), Fizz (6), Woof Woof (7), 8, Fizz (9), Buzz (10), 11, Fizz (12), Fizz (13), Woof (14), Fizz Buzz Buzz (15)\n" +
                    "\n" +
                    "30 – Fizz Fizz Buzz\n" +
                    "\n" +
                    "33 – Fizz Fizz Fizz\n" +
                    "\n" +
                    "35 – Fizz Buzz Buzz Woof\n" +
                    "\n" +
                    "55 – Buzz Buzz Buzz"
        )
    )

}
