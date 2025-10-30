package week1

/**
 *
 *  - 풀이 시간 : 30분 00초
 *  - 메모리: 12344 KB
 *  - 시간 : 80 ms
 */
@Suppress("SpellCheckingInspection")
fun baekjoon2839() {
    val n = readln().toInt()
    var result = -1
    var temp = n

    var fiveCount = temp / 5

    while (fiveCount >= 0) {
        val remaining = temp - (fiveCount * 5)

        if (remaining % 3 == 0) {
            val threeCount = remaining / 3
            result = fiveCount + threeCount
            break
        }

        fiveCount--
    }

    println(result)
}