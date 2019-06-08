package learn.kotlin

data class Person(val name: String, val age: Int? = null)

fun main() {
    val fibo = FibonacciSeries(4)
    println(fibo.fibonacciSeries())

    val persons = listOf(Person("Alice"), Person("leela", 20))
    val oldest = persons.maxBy { some -> some.age ?: 0 }
    println("The oldest is : $oldest")
    println("large number is : ${max(2, 3)}")
    val women = Person("women", 20)
    println(women.age)
    println(printBoard())
    val rectangle = Rectangle(41, 43)
    println(rectangle.isSquare)
    println(rectangle.isRectangle)
    println(getDifferentColor(Color.RED))

}

fun max(a: Int, b: Int): Int = if (a > b) a else b

class Rectangle(private val height: Int, private val width: Int) {
    val isSquare: Boolean
        get() = height == width

    val isRectangle: Boolean
        get() = height != width
}

fun getDifferentColor(color: Color) =
        when (color) {
            Color.RED -> "Richard"
            Color.ORANGE -> "something"
            else -> "nothing"
        }
