package exam10

// Java 의 record
data class Person(
    val name: String,
    val age: Int
)

fun main() {
    val p1 = Person("Alice", 29)
    val p2 = Person("Alice", 29)

    println(p1)
    println(p1 == p2)
}