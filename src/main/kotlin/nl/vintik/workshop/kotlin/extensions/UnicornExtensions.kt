package nl.vintik.workshop.kotlin.extensions

import nl.vintik.workshop.kotlin.basics.Unicorn
import nl.vintik.workshop.kotlin.basics.UnicornType

fun Unicorn.toMalicorn(): Unicorn = Unicorn(this.id, this.name, UnicornType.MALICORN, this.size, this.magic, this.description)

fun Unicorn.computePower(): Int? = TODO("Implement extension function with Unicorn as receiver")

fun List<Unicorn>.filterByType(vararg unicornType: UnicornType): List<Unicorn> = this.filter { it.type.equals(unicornType) }

fun List<Unicorn>.filterBySize(sizeFrom: Int): List<Unicorn> = this.filter { it.size == sizeFrom }
