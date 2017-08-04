package i_introduction._0_Atut

import org.junit.Test

import org.junit.Assert.*

/**
 * Created by Pavan.VijayaNar on 8/2/2017.
 */
class FibonacciTest {
    @Test
    fun generateFibSeriesForZero() {
        assertEquals(arrayListOf(0), Fibonacci().generateFibSeries(0))
    }

    @Test
    fun generateFibSeriesForOne() {
        assertEquals(arrayListOf(0, 1), Fibonacci().generateFibSeries(1))
    }

    @Test
    fun generateFibSeriesFor2() {
        assertEquals(arrayListOf(0, 1, 1), Fibonacci().generateFibSeries(2))
    }
    @Test
    fun generateFibSeriesFor5() {
        assertEquals(arrayListOf(0, 1, 1, 2, 3, 5), Fibonacci().generateFibSeries(5))
    }

    @Test
    fun generateFibSeriesFor10() {
        assertEquals(arrayListOf(0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55), Fibonacci().generateFibSeries(10))
    }

}