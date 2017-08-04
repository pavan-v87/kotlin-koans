package i_introduction._12_Extensions_On_Collections

import util.TODO
import util.doc12

fun todoTask12(): Nothing = TODO(
    """
        Task 12.
        Kotlin standard library contains lots of extension functions that make the work with collections more convenient.
        Rewrite the previous example once more using an extension function 'sortedDescending'.

        Kotlin code can be easily mixed with Java code.
        Thus in Kotlin we don't introduce our own collections, but use standard Java ones (slightly improved).
        Read about read-only and mutable views on Java collections.
    """,
    documentation = doc12()
)

fun task12(): List<Int> {
    val arrayListOf = arrayListOf(1, 5, 2)
    return arrayListOf.sortedDescending()
}

fun List<Int>.sortedDescending(): List<Int> {
    val comparator = object :Comparator<Int> {
        override fun compare(p0: Int, p1: Int): Int {
            return p1 - p0
        }
    }
    return sortedWith(comparator)
}
