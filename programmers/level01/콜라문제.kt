package com.algo.programmers.level01

// K번째수.kt
// https://school.programmers.co.kr/learn/courses/30/lessons/132267
class P132267 {
    fun solution(a: Int, b: Int, n: Int): Int {
        var answer: Int = 0
        var given: Int = n
        var remain: Int = 0
        while(given + remain >= a) {
            val tem = given+remain
            given = ((tem)/a)*b
            remain = (tem)%a
            answer += given
        }
        return answer
    }
}