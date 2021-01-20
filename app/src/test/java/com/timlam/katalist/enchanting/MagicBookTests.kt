package com.timlam.katalist.enchanting

import com.timlam.katalist.exercises.enchanting.Dagger
import com.timlam.katalist.exercises.enchanting.Enchantment
import com.timlam.katalist.exercises.enchanting.MagicBook
import org.junit.Assert
import org.junit.Test

class MagicBookTests {

    private val shouldNotBreak = false
    private val shouldBreak = true
    private val magicBook = MagicBook { shouldNotBreak }

    @Test
    fun `enchant a non enchanted dagger randomly with one of the possible enchantments`() {
        val dagger = Dagger()

        val enchantedDagger = magicBook.enchant(dagger)

        Assert.assertTrue(Enchantment.values().contains(enchantedDagger.enchantment))
    }

    @Test
    fun `enchant an enchanted dagger randomly with one of the possible enchantments`() {
        Enchantment.values().forEach {
            val dagger = Dagger(enchantment = it)
            val enchantedDagger = magicBook.enchant(dagger)

            Assert.assertEquals(true, enchantedDagger.enchantment != it)
        }
    }

    @Test
    fun `enchant an enchanted dagger reverts to its original form with ten percent probability`() {
        val dagger = Dagger(enchantment = Enchantment.Fire)
        val magicBook = MagicBook { shouldBreak }

        val enchantedDagger = magicBook.enchant(dagger)

        Assert.assertEquals(null, enchantedDagger.enchantment)
    }

}
