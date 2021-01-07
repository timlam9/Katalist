package com.timlam.katalist.enchanting

import io.mockk.every
import io.mockk.mockk
import org.junit.Assert.assertEquals
import org.junit.Test

class DuranceTests {

    @Test
    fun `enchant a non enchanted dagger with a random enchantment`() {
        val magicBook = mockk<MagicBook>()
        val dagger = Dagger()
        val durance = Durance(dagger, magicBook)
        val infernoDagger = Dagger(enchantment = Enchantment.Fire)
        every { magicBook.enchant(dagger) } returns infernoDagger

        val randomizedDagger = durance.enchant()

        assertEquals(infernoDagger, randomizedDagger)
    }

    @Test
    fun `enchanting an enchanted dagger has 1 to 10 changes to revert to its original form`() {
        val magicBook = MagicBook { true }
        val dagger = Dagger()
        val infernoDagger = Dagger(enchantment = Enchantment.Fire)
        val durance = Durance(infernoDagger, magicBook)

        val randomizedDagger = durance.enchant()

        assertEquals(dagger, randomizedDagger)
    }

    @Test
    fun `describing a non enchanting dagger`() {
        val expected = "Dagger of the Nooblet\n" + "5 - 10 attack damage\n" + "1.2 attack speed"
        val durance = Durance(Dagger(), MagicBook { false })

        val description = durance.describeWeapon()

        assertEquals(expected, description)
    }

    @Test
    fun `describing an enchanting dagger`() {
        val expected = "Inferno Dagger of the Nooblet\n" + "5 - 10 attack damage\n" + "1.2 attack speed\n" + "+5 fire damage"
        val durance = Durance(Dagger(enchantment = Enchantment.Fire), MagicBook { false })

        val description = durance.describeWeapon()

        assertEquals(expected, description)
    }

}


