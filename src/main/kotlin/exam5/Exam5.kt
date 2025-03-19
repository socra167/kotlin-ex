package exam5

class Person(
    var name: String,
    var age: Int
) {
    fun greet() {
        println("Hello, my name is $name")
    }
}

fun main() {
    val person = Person("Alice", 20)
    person.greet()
}