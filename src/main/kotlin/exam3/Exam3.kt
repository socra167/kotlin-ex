fun main() {
    for (i in 0..4) {
        println("Count: $i")
    }

    // until은 앞의 수는 포함하되, 뒷 수는 포함하지 않는다
    // 배열 탐색에 자주 사용된다
    for (i in 1 until 100) {
        println(i)
    }
}