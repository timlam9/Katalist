package com.timlam.katalist.exercises.enchanting

data class Dagger(val enchantment: Enchantment? = null) {

    private val basicTitle = "Dagger of the Nooblet"
    private val title: String = updateTitle()
    private val attackDamage: String = "5 - 10 attack damage"
    private val attackSpeed: String = "1.2 attack speed"

    private fun updateTitle(): String = if (enchantment != null) "${enchantment.prefix} $basicTitle" else basicTitle

    override fun toString(): String {
        val newLine = "\n"
        val extraDamage = enchantment?.let { newLine + it.toString() } ?: ""
        return title + newLine + attackDamage + newLine + attackSpeed + extraDamage
    }

}
