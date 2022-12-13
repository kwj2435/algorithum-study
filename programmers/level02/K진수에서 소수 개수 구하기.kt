package com.algo.programmers.level02

// k진수에서 소수 개수 구하기
// https://school.programmers.co.kr/learn/courses/30/lessons/92335
class P92335 {
    fun solution(n: Int, k: Int): Int {
        var temN = n
        var temNum = ""
        while(temN != 0) {
            temNum = (temN % k).toString().plus(temNum)
            temN /= k
        }
        val numbers = temNum.split("0").filter { it != "" }
        return numbers.filter { isPrime(it.toLong()) }.count()
    }

    private fun isPrime(n: Long): Boolean {
        if(n == 1L) return false
        (2..sqrt(n.toDouble()).toLong()).forEach {
            if(n % it == 0L) return false
        }
        return true
    }
}