data class Person(val name: String, val age: Int? = null)

fun main() {
    val persons = listOf(Person("Alice"), Person("leela", 20))
    val oldest = persons.maxBy { some -> some.age ?: 0 }
    println("The oldest is : $oldest")
    println("large number is : ${max(2,3)}")
}

fun max(a:Int,b:Int) :Int{
    if (a>b) return a
    return b
}