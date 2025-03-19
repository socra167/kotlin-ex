package exam8

class Person(
    val leftArm: Arm = Arm(),
    val rightArm: Arm = Arm()
)

class Arm(
    val hand: Hand = Hand()
)

class Hand() {
    fun grab() {
        println("Grabbing!")
    }
}

fun main() {
    val name: String? = "hello"
    println(name?.length ?: "Name is null")

    val person = Person()
    // Java 에서 안전하게 함수를 호출하려면 이렇게 해야 한다
    // if ( person != null && person.leftArm != null && person.leftArm.hand != null ) person.leftArm.hand.grab();
    person?.leftArm?.hand?.grab()
}