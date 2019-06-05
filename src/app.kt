data class Person(val name: String, val age: Int? = null)

fun main() {
    val persons = listOf(Person("Alice"), Person("leela", 20))
    val oldest = persons.maxBy { some -> some.age ?: 0 }
    println("The oldest is : $oldest")
    println("large number is : ${max(2, 3)}")
    val sapana = Person("Sapana", 20)
    println(sapana.age)
    println(printBoard())
    val rectangle = Rectangle(41, 43)
    println(rectangle.isSquare)
    println(rectangle.isRectangle)
}

fun max(a:Int,b:Int) :Int = if (a>b) a else b

class Rectangle (private val height:Int, private val width:Int) {
    val isSquare:Boolean
    get() {
        return height == width
    }
    val isRectangle:Boolean
    get() {
        return height != width
    }
}