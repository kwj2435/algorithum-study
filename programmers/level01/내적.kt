package com.algo.programmers.level01

// 내적
// https://school.programmers.co.kr/learn/courses/30/lessons/70128
class P70128 {
    fun solution(a: IntArray, b: IntArray): Int {
        var answer = 0
        a.forEachIndexed{index, value ->
            answer += value * b[index]
        }
        return answer
    }
}