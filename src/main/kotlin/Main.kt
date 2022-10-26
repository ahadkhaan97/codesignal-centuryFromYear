fun main() {
    solution(1700)
}

fun solution(year: Int): Int {
    return kotlin.math.floor((year / 100).toDouble()).toInt() + if (year % 100 == 0) {
        0
    } else {
        1
    }
}