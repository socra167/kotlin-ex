package exam11

fun main() {
    val name: String = "Alice"
    name.greet() // Hello, Alice!

    val intList = listOf(1, 2, 3, 4, 5)

    var sum = 0;
    for (item in intList) {
        sum += item
    }

    intList.sum() // 합

    intList.average() // 평균

    val squaredIntList = intList.square()
    squaredIntList.forEach(::println)
}

private fun List<Int>.square(): List<Int> {
    val result = this.map { it * it }
    return result
}

private fun String.greet() {
    println("Hello, $this!")
}
