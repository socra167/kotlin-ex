package exam7

fun main() {
//    val ages = mapOf("Peter" to 24, "Clark" to 31, "Bruce" to 32)
    val ages = mutableMapOf("Peter" to 24, "Clark" to 31, "Bruce" to 32)

    ages["Peter"] = 26

    for ((key, value) in ages) {
        println("$key is $value years old.")
    }
}