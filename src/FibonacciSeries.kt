fun fibonacciSeries(number: Int) {
    var firstNumber = 0
    var secondNumber = 1

    for (i in 0..number) {
        println("$firstNumber")
        val sum = firstNumber + secondNumber
        firstNumber = secondNumber
        secondNumber = sum
    }
}

fun main() {
    fibonacciSeries(6)
}