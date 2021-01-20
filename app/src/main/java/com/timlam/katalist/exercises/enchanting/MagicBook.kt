package com.timlam.katalist.exercises.enchanting

class MagicBook(private val shouldRevertToOriginalForm: () -> Boolean = { (1..10).random() == 5 }) {

    private val enchantments = Enchantment.values()

    fun enchant(dagger: Dagger): Dagger = Dagger(enchantment = pickRandomEnchantment(dagger.enchantment))

    private fun pickRandomEnchantment(enchantment: Enchantment?): Enchantment? {
        if (enchantment != null) {
            if (shouldRevertToOriginalForm()) {
                return null
            }
            enchantments.filter { it != enchantment }.run {
                return elementAt(indices.random())
            }
        }

        return enchantments.elementAt(enchantments.indices.random())
    }

}
