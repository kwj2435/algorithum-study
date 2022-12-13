package com.algo.algorithumstudy.programmers.level02

import java.util.*

// 프린터
// https://school.programmers.co.kr/learn/courses/30/lessons/42587
class P42587 {
    fun solution(priorities: IntArray, location: Int): Int {
        val queue: Queue<Pair<Int,Int>> = LinkedList()
        priorities.forEachIndexed{index, value ->
            queue.add(Pair(value, index))
        }

        var answer = 0
        while(queue.isNotEmpty()) {
            if(queue.any{it.first > queue.peek().first}) {
                queue.add(queue.poll())
                continue
            }
            answer ++
            if(queue.peek().second == location) break
            queue.poll()
        }
        return answer
    }
}