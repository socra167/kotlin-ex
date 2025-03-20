package exam29

// Kotlin 에선 기본적으로 상속이 불가능한 final class
// open 키워드로 상속이 가능하도록 열어 주어야 한다
open class Animal {

    // 메서드도 기본적으로 오버라이딩이 불가능한 final method
    // open 키워드로 오버라이딩이 가능하도록 열어 주어야 한다
    open fun makeSound() {
        println("animal noise")
    }
}

class Dog : Animal() {
    override fun makeSound() {
        println("bark bark!")
    }
}

fun main() {
    val dog: Animal = Dog()
    dog.makeSound()
}