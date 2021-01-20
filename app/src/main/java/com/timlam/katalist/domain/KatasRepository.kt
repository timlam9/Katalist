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
        ),
        Kata(
            title = "Enchanting",
            image = R.drawable.enchanting,
            info = "Durance has found a magic book in one of his adventures and decided to learn how to enchant his weapons. Due to the unstable nature of magic, he is not sure of what kind of magical things will happen, he might even lose previous enchantments! (That happens every 1/10th of the time) Let’s try to help him.\n" +
                    "\n" +
                    "Create an application that allows Durance to enchant his weapon.\n" +
                    "\n" +
                    "For this version of the kata, only one enchantment is allowed. We might re-roll an existing enchantment but there is a 1/10 that we might lose all current enchantments on the weapon.\n" +
                    "\n" +
                    "Example:\n" +
                    "\n" +
                    "Dagger of the Nooblet\n" +
                    " 5 - 10 attack damage\n" +
                    " 1.2 attack speed\n" +
                    "After enchanting it, Durance rolled the Fire enchantment!\n" +
                    "\n" +
                    "Inferno Dagger of the Nooblet\n" +
                    " 5 - 10 attack damage\n" +
                    " 1.2 attack speed\n" +
                    " +5 fire damage\n" +
                    "Not satisfied, he enchanted it again and this time he got the Agility enchantment!\n" +
                    "\n" +
                    "Quick Dagger of the Nooblet\n" +
                    " 5 - 10 attack damage\n" +
                    " 1.2 attack speed\n" +
                    " +5 agility\n" +
                    "He felt confident thinking that he could get something better and tried again, sadly, he lost his enchantment!\n" +
                    "\n" +
                    "Dagger of the Nooblet\n" +
                    " 5 - 10 attack damage\n" +
                    " 1.2 attack speed\n" +
                    "Only 1 enchantment should be \"active\" at a time\n" +
                    "Enchanted weapons have the prefix of the enchantment on them\n" +
                    "Enchantment selection should be randomized\n" +
                    "We can’t roll an enchantment we already have, they are always different\n" +
                    "1/10 probability of losing the enchantment\n" +
                    "An enchantment adds different attributes to a weapon, for this kata, we can choose among the following:\n" +
                    "\n" +
                    "Enchantment\tPrefix\tAttributes\n" +
                    "Ice\tIcy\t+5 ice damage\n" +
                    "Fire\tInferno\t+5 fire damage\n" +
                    "Lifesteal\tVampire\t+5 lifesteal\n" +
                    "Agility\tQuick\t+5 agility\n" +
                    "Strength\tAngry\t+5 strength\n" +
                    "public class Durance{\n" +
                    "  Weapon weapon;\n" +
                    "  MagicBook magicBook;\n" +
                    "  \n" +
                    "  public void enchant(){\n" +
                    "// Implement here...\n" +
                    "  }\n" +
                    "  \n" +
                    "  public String describeWeapon(){\n" +
                    "// Implement here...\n" +
                    "  }\n" +
                    "}\n" +
                    "\n" +
                    "public interface Weapon{\n" +
                    "  String stats();\n" +
                    "}\n" +
                    "Durance can now carry more weapons and each one can have up to 3 unique enchantments, he is also worried about dealing the most damage possible, so DPS (Damage per second) should be displayed as well.\n" +
                    "\n" +
                    "We take the agility attribute into account, converting it to an attack speed increase equal to: attack speed + agility points / 10\n" +
                    "\n" +
                    "DPS is calculated as: ((Min Weapon Damage + Max Weapon Damage) / 2) / Weapon Speed\n" +
                    "\n" +
                    "Previous rules apply\n" +
                    "In case of a losing enchantment roll, only the last enchantment should be removed"
        ),
        Kata(
            title = "Mars Rover",
            image = R.drawable.mars_rover,
            info = "It's very common to find programs which rely on state. This is especially true of user interface code.\n" +
                    "\n" +
                    "However, state is also a very common source of bugs. The main reason for this is that state is simply hard to reason about.\n" +
                    "\n" +
                    "To a certain extent, good test cases help in stateful programs. However, we find that testing on its own is not enough: a good design is essential too.\n" +
                    "\n" +
                    "This kata lends itself to a variety of object-oriented design approaches, which makes it a great way to practice your design skills. It is well-suited to two Design Patterns in particular: the Command pattern and the State pattern.\n" +
                    "\n" +
                    "There are a variety of ways to practice with this kata. We suggest making an initial implementation first, following the SOLID principles and the 4 rules of simple design. Afterwards, see if you can refactor your solution to use either of the design patterns above. You could also retry the kata from scratch with a particular solution in mind.\n" +
                    "\n" +
                    "A squad of robotic rovers are to be landed by NASA on a plateau on Mars.\n" +
                    "\n" +
                    "This plateau, which is curiously rectangular, must be navigated by the rovers so that their onboard cameras can get a complete view of the surrounding terrain to send back to Earth.\n" +
                    "\n" +
                    "Your task is to develop an API that moves the rovers around on the plateau.\n" +
                    "\n" +
                    "In this API, the plateau is represented as a 10x10 grid, and a rover has state consisting of two parts:\n" +
                    "\n" +
                    "its position on the grid (represented by an X,Y coordinate pair)\n" +
                    "the compass direction it's facing (represented by a letter, one of N, S, E, W)\n" +
                    "The input to the program is a string of one-character move commands:\n" +
                    "\n" +
                    "L and R rotate the direction the rover is facing\n" +
                    "M moves the rover one grid square forward in the direction it is currently facing\n" +
                    "If a rover reaches the end of the plateau, it wraps around the end of the grid.\n" +
                    "\n" +
                    "The program's output is the final position of the rover after all the move commands have been executed. The position is represented as a coordinate pair and a direction, joined by colons to form a string. For example: a rover whose position is 2:3:W is at square (2,3), facing west.\n" +
                    "\n" +
                    "The grid may have obstacles. If a given sequence of commands encounters an obstacle, the rover moves up to the last possible point and reports the obstacle by prefixing O: to the position string that it returns. For instance, O:1:1:N would mean that the rover encountered an obstacle at position (1, 2).\n" +
                    "\n" +
                    "given a grid with no obstacles, input MMRMMLM gives output 2:3:N\n" +
                    "given a grid with no obstacles, input MMMMMMMMMM gives output 0:0:N (due to wrap-around)\n" +
                    "given a grid with an obstacle at (0, 3), input MMMM gives output O:0:2:N\n" +
                    "There are no restrictions on the design of the public interface. In particular, much of the details of the obstacle feature's implementation are up to you.\n" +
                    "\n" +
                    "A public interface to the API could look something like this:\n" +
                    "\n" +
                    "class MarsRover {\n" +
                    "    public MarsRover(Grid grid);\n" +
                    "    public String execute(String command);\n" +
                    "}\n" +
                    "Rules:\n" +
                    "\n" +
                    "The rover receives a char array of commands e.g. RMMLM and returns the finishing point after the moves e.g. 2:1:N\n" +
                    "The rover wraps around if it reaches the end of the grid."

        ),
        Kata(
            title = "Tennis",
            image = R.drawable.tennis,
            info = "This kata is well suited to developers who have some familiarity with TDD basics and want to improve their algorithm design skills. It is a stateless, algorithmic version of the classic Tennis kata (where the program also holds the current score and updates its state when a player scores a new point).\n" +
                    "\n" +
                    "Both Tennis and Bowling can also be done holding state (e.g. with a scorePoint() method of some sort). However, when learning pure algorithmic TDD, we prefer to stay stateless as the added difficulty of maintaining state can distract from the main learning points.\n" +
                    "\n" +
                    "Write a program that accepts two integers, and converts them to a tennis-style score.\n" +
                    "\n" +
                    "The scoring rules of tennis (per Wikipedia) are as follows:\n" +
                    "\n" +
                    "A game is won by the first player to have won at least four points in total and at least two points more than the opponent.\n" +
                    "Scores from zero to three points are described as “love”, “fifteen”, “thirty”, and “forty” respectively.\n" +
                    "If at least three points have been scored by each player and the scores are equal, the score is “deuce”.\n" +
                    "If at least three points have been scored by each player and a player has one more point than his opponent, the score is “advantage” for the player in the lead.\n" +
                    "Start with with the following interface:\n" +
                    "\n" +
                    "public class TennisScoreCalculator {\n" +
                    "    public string Score(int player1Points, int player2Points);\n" +
                    "}\n" +
                    "Credits: http://codingdojo.org/kata/Tennis/\n" +
                    "\n"
        ),
        Kata(
            title = "Diamond",
            image = R.drawable.diamond,
            info = "This project contains sourcefiles and a skeleton for a solution to the Diamond Kata. You can of course just code this kata from scratch in any way you wish. This repo will help you to explore two different approaches to the problem - an interative approach, where you 'recycle' test cases, and an incremental approach, where all test cases are valid for the full solution.\n" +
                    "\n" +
                    "For more discussion of 'test recycling' see Seb Rose's blog post\n" +
                    "\n" +
                    "So far I have starting code for the problem in Scala, Java and Python. The original version was the Scala, so please be forgiving if I have used Scala idioms or generally translated it badly into the other languages. I welcome pull requests with improvements and/or translations to more programming languages.\n" +
                    "\n" +
                    "Kata Description\n" +
                    "(this description is copied from http://cyber-dojo.org)\n" +
                    "\n" +
                    "Given a letter print a diamond starting with 'A' with the supplied letter at the widest point.\n" +
                    "\n" +
                    "For example: print-diamond 'E' prints\n" +
                    "\n" +
                    "    A\n" +
                    "   B B\n" +
                    "  C   C\n" +
                    " D     D\n" +
                    "E       E\n" +
                    " D     D\n" +
                    "  C   C\n" +
                    "   B B\n" +
                    "    A\n" +
                    "For example: print-diamond 'C' prints\n" +
                    "\n" +
                    "  A\n" +
                    " B B\n" +
                    "C   C\n" +
                    " B B\n" +
                    "  A"
        )
    )

}
