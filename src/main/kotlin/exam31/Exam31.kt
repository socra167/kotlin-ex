package exam31

class Person(
    val name: String = ""
)

fun main() {
    val p = Person("Alice")

    // p.name = "asd" // Val cannot be reassigned
    println(p.name)
}