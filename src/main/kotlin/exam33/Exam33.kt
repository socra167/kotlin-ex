package exam33

class Person(
    var _name: String = ""
) {
    var name: String
        get() {
            if (_name.isEmpty()) throw IllegalStateException("이름이 설정되지 않았습니다.")
            return _name
        }
        set(value) {
            if (value.isEmpty()) throw IllegalArgumentException("이름은 비어 있을 수 없습니다.")
            _name = value
        }
}

fun main() {
    val p = Person()
    println(p.name) // java.lang.IllegalStateException: 이름이 설정되지 않았습니다.
    p.name = "" // java.lang.IllegalArgumentException: 이름은 비어 있을 수 없습니다.
}