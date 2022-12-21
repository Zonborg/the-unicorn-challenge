package nl.vintik.workshop.kotlin.basics

import nl.vintik.workshop.kotlin.extensions.filterBySize
import nl.vintik.workshop.kotlin.extensions.filterByType
import java.util.UUID

class UnicornHouse {
    /**
     * Collections such as list or map by default are immutable, you need to explicitly specify one as mutable
     * For more see https://kotlinlang.org/docs/list-operations.html
     */
    val unicorns = mutableListOf<Unicorn>()

    /**
     * When expression example, for more see https://kotlinlang.org/docs/control-flow.html#when-expression
     * @param unicorn is defined as not null
     */
    fun enter(unicorn: Unicorn): String {
//        TODO("Add unicorn to unicorns list")
        unicorns.add(unicorn)
//        TODO("Print unicorn description if it is not null")
        println(unicorn.description)
//        TODO("Print a welcome message for each unicorn type, see unit test UnicornHouseTest for expected message")
        return ("Welcome ${unicorn.description} Unicorn ${unicorn.name}")
    }

    //TODO("Implement method that executes enter(unicorn) for each unicorn and return all welcome messages as list")
    fun bulkEnter(vararg unicorn: Unicorn): List<String> {
        val welcomeStrings:MutableList<String> = arrayListOf()
        for(current in unicorn){
            welcomeStrings.add(enter(current))
        }
        return welcomeStrings
    }

    fun exit(unicornId: UUID): Boolean = unicorns.removeIf { it.id == unicornId }

    fun countUnicorns(): Int = unicorns.count()

    fun countUnicornsByType(unicornType: UnicornType): Int = unicorns.count { it.type == unicornType }

    //TODO("Convert unicorn list to a map keyed by unicorn type. If any two elements would have the same key, then the last one gets added to the map")
    fun mapUnicornsByType(): Map<UnicornType, Unicorn> = TODO("Convert unicorn list to a map keyed by unicorn type. If any two elements would have the same key, then the last one gets added to the map")

    fun orderUnicornsBySizeDescending(): List<Unicorn> = TODO("Return a list of all unicorns (from unicorns list) sorted in descending order of unicorn size")

    //TODO("Return the some of magic property (if present) of all unicorns in unicorn list")
    fun totalMagicInDaHouse(): Int = unicorns.sumOf { it.magic ?: 0 }

    fun filterUnicornsByType(vararg unicornType: UnicornType): List<Unicorn> = unicorns.filterByType(*unicornType)

    fun filterUnicornsBySize(sizeFrom: Int) =
        unicorns.filterBySize(sizeFrom)

}