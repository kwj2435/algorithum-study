package com.algo.programmers.level01

// BinaryGap
class BinaryGap {
    fun solution(A: IntArray): Int {
        val tem = mutableMapOf<Int, Int>().apply {
            A.forEach { put(it, getOrDefault(it, 0)+1) }
        }

        var answer = 0
        tem.forEach{
            if(it.value % 2 == 1) {
                answer = it.key
            }
        }
        return answer
    }
}