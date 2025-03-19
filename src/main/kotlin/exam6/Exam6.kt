package exam6

fun main() {
//    val names = listOf("Alice", "Bob", "Charlie")
    val mutableNames = mutableListOf("Alice", "Bob", "Charlie")

    mutableNames.add("Bob")

    for (name in mutableNames) {
        println(name)
    }
}