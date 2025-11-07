package week1

/**
 *
 *  - 풀이 시간 : 30분 00초
 *  - 메모리: 21376 KB
 *  - 시간 : 112 ms
 */
@Suppress("SpellCheckingInspection")
fun baekjoon1541() {
    val input = readln()
    val groups = input.split("-")
    var result = groups[0].split("+").sumOf { it.toInt() }

    for (i in 1..<groups.size) {
        result -= groups[i].split("+").sumOf { it.toInt() }
    }

    println(result)
}