package com.timlam.katalist.enchanting

class Durance(
    private val dagger: Dagger,
    private val magicBook: MagicBook
) {

    fun enchant(): Dagger = magicBook.enchant(dagger)

    fun describeWeapon(): String = dagger.toString()

}
