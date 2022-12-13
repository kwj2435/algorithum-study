package com.algo.algorithumstudy.programmers.level02

import java.util.*
import kotlin.math.ceil

// 기능개발
// https://school.programmers.co.kr/learn/courses/30/lessons/42586
class P42586 {
    fun solution(progresses: IntArray, speeds: IntArray): IntArray {
        val queue: Queue<Int> = LinkedList()
        progresses.forEachIndexed { index, i ->
            queue.add(ceil((100-i) /speeds[index].toFloat()).toInt())
        }

        val answer = mutableListOf<Int>()
        var job = 0
        var maxJobSize = 0
        progresses.forEach{
            val value = queue.poll()
            if(job == 0) {
                job++
                maxJobSize = value
            } else if(maxJobSize >= value) {
                job++
            } else {
                answer.add(job)
                job = 1
                maxJobSize = value
            }
            if(queue.isEmpty()) answer.add(job)
        }
        return answer.toIntArray()
    }
}