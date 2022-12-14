package com.algo.programmers.level01

// 정수 제곱근 판별
// https://school.programmers.co.kr/learn/courses/30/lessons/12934
class P12934 {
    fun solution(n: Long): Long {
        val result = Math.sqrt(n.toDouble())
        return if(result % 1 == 0.0) ((result + 1) * (result + 1)).toLong() else -1
    }
}