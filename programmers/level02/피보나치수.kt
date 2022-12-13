package com.algo.programmers.level02

// 피보나치 수
// https://school.programmers.co.kr/learn/courses/30/lessons/12945
class P12945 {
    fun solution(n: Int): Long {
        val answer = fibo(n)
        return answer
    }

    private fun fibo(n: Int): Long {
        val arr = LongArray(n+1){1}
        (3..n).forEach{ arr[it] = (arr[it-1] + arr[it-2])%1234567}
        return arr[n]
    }
}
