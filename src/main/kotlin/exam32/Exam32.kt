package exam32

class Person {
    private var _name: String = ""

    var name: String
        get() = throw IllegalAccessException("Can't access")
        set(value) {
            _name = value
        }
}

fun main() {
    val p = Person()
    p.name = "Alice"
    println(p.name)
}