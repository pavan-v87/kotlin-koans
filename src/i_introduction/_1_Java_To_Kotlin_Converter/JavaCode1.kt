package i_introduction._1_Java_To_Kotlin_Converter

import util.JavaCode

/**
 * Created by Pavan.VijayaNar on 7/30/2017.
 */

class JavaCode1 : JavaCode() {
    fun task1(collection: Collection<Int>): String {
        val sb = StringBuilder()
        sb.append("{")
        val iterator = collection.iterator()
        while (iterator.hasNext()) {
            val element = iterator.next()
            sb.append(element)
            if (iterator.hasNext()) {
                sb.append(", ")
            }
        }
        sb.append("}")
        return sb.toString()
    }
}