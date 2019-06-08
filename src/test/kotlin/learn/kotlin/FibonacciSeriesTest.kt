package learn.kotlin

import org.junit.Assert.assertArrayEquals
import org.junit.Test

class FibonacciSeriesTest {

    @Test
    fun fibonacciSeries() {
        val fibonacciSeries = FibonacciSeries(2)
        assertArrayEquals(arrayOf(0, 1, 1), fibonacciSeries.fibonacciSeries())
    }


}
