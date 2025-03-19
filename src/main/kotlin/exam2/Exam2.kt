fun main() {
    val number = 15

    val str = if (number % 2 == 0) "even" else "odd"

    if (number % 2 == 0) {
        print("2의 배수")
    } else if (number % 3 == 1) {
        print("3의 배수")
    } else if (number % 5 == 1) {
        print("5의 배수")
    }

    when {
        number % 2 == 0 -> print("2의 배수")
        number % 3 == 0 -> print("3의 배수")
        number % 5 == 0 -> print("5의 배수")
    }

    when (number) {
        1 -> print("1")
        2 -> print("2")
        3 -> print("3")
    }
}
