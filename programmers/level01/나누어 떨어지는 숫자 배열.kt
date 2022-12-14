package com.algo.programmers.level01

// 나누어 떨어지는 숫자 배열
// https://school.programmers.co.kr/learn/courses/30/lessons/12910
class P12910 {
    fun solution(arr: IntArray, divisor: Int): IntArray {
        val answer = arr.filter { it % divisor == 0 }.toMutableList()
        if(answer.isEmpty()) { answer.add(-1) }
        return answer.sorted().toIntArray()
    }
}