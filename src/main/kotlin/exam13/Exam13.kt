package exam13

class Test {}

object Singleton {}

fun main() {
    val t1 = Test()
    val t2 = Test()
    println(t1 == t2)

    val s1 = Singleton
    val s2 = Singleton

    println(s1 === s2)
}