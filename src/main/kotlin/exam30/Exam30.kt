package exam30

interface Animal {
    fun eat()
}

interface Pet {
    fun play()
}

class Dog : Animal, Pet {

    override fun eat() {
        println("eat")
    }

    override fun play() {
        println("play")
    }
}

fun main() {
    val dog: Animal = Dog()
    dog.eat()
}