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
        )
    )

}
