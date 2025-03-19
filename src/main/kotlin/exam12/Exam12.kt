package exam12

class Greeting {
    fun sayHello(name: String = "Guest") {
        println("Hello, $name")
    }
}

fun main() {
    val greeting: Greeting = Greeting()
    greeting.sayHello()
    greeting.sayHello("Alice")
}