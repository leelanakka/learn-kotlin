package learn.kotlin

import org.junit.Assert.assertArrayEquals
import org.junit.Test

class FibonacciSeriesTest {

    @Test
    fun fibonacciSeries() {
        val fibonacciSeries = FibonacciSeries(2)
        assertArrayEquals(arrayOf(0,1), fibonacciSeries.fibonacciSeries())
    }

    @Test
    fun shouldGiveOnlyOneNumberIfTheNumberTermsWeWantIs1() {
        val fibonacciSeries = FibonacciSeries(1)
        assertArrayEquals(arrayOf(0), fibonacciSeries.fibonacciSeries())
    }
}
