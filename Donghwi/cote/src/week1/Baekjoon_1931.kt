package week1

/**
 *
 *  - 풀이 시간 : 30분 00초
 *  - 메모리: 129268 KB
 *  - 시간 : 1056 ms
 */
@Suppress("SpellCheckingInspection")
fun baekjoon1931() {
    val time = readln().toInt()
    val meetingClass = Array(time) {
        readln().split(" ").map { it.toInt() }.toIntArray()
    }

    meetingClass.sortWith(compareBy(
        { it[1] }, { it[0] }
    ))

    var count = 0
    var lastEndTime = 0

    meetingClass.forEach { meeting ->
        if (meeting[0] >= lastEndTime) {
            count++
            lastEndTime = meeting[1]
        }
    }

    println(count)
}