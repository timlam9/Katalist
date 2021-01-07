package com.timlam.katalist.enchanting

enum class Enchantment(
    val prefix: String,
    private val attribute: String
) {

    Fire("Inferno", "fire"),
    Ice("Icy", "ice"),
    Lifesteal("Vampire", "lifesteal"),
    Agility("Quick", "agility"),
    Strength("Angry", "strength");

    override fun toString(): String {
        return "+5 $attribute damage"
    }

}
