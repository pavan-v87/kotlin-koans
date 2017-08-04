package i_introduction._0_Atut

import i_introduction._1_Java_To_Kotlin_Converter.JavaCode1

/**
 * Created by Pavan.VijayaNar on 8/2/2017.
 */
class Fibonacci {
    fun generateFibSeries(n: Int): List<Int> {
        val arrayList = ArrayList<Int>()
        if (n == 0) {
            arrayList.add(0)
        }
        else {
            arrayList.add(0)
            arrayList.add(1)
            if (n > 1) {
                recFib(n, 2, arrayList)
            }
        }

        return arrayList//JavaCode1().task1(arrayList)
    }

    private fun recFib(n: Int, i:Int, arrayList: ArrayList<Int>) {
        if (i <= n) {
            val sum = arrayList.get(i -1) + arrayList.get(i-2)
            arrayList.add(sum)
            recFib(n, i+1, arrayList)
        }
        return
    }
}