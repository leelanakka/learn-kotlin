package  learn.kotlin

open class FibonacciSeries(val number: Int) {

    fun fibonacciSeries(): Array<Int> {
        var firstNumber = 0
        var secondNumber = 1
        val fibonacciNumbers = Array(number) { 0 }
        for (i in 0 until number) {
            println("$firstNumber")

            fibonacciNumbers.set(i, firstNumber)
            val sum = firstNumber + secondNumber
            firstNumber = secondNumber
            secondNumber = sum
        }
        return fibonacciNumbers
    }

}


