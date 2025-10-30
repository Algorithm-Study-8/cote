package week1

/**
 *
 *  - 풀이 시간 : 30분 00초
 *  - 메모리: 12252 KB
 *  - 시간 : 76 ms
 */
@Suppress("SpellCheckingInspection")
fun baekJoon5585() {
    val pay = 1000
    var money = readln().toInt()

    var result = 0
    val payback = arrayOf(500, 100, 50, 10, 5, 1)

    var minusPay = pay - money

    for (i in payback.indices) {
        result += minusPay / payback[i]
        minusPay %= payback[i]
    }

    println(result)
}