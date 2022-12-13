package com.algo.algorithumstudy.programmers.level02

// 예상 대진표
// https://school.programmers.co.kr/learn/courses/30/lessons/12985
class P12985 {
    fun solution(n: Int, a: Int, b: Int): Int {
        var answer = 1
        var temA = calcu(a)
        var temB = calcu(b)

        while(temA != temB) {
            answer += 1
            temA = calcu(temA)
            temB = calcu(temB)
        }
        return answer
    }
    fun calcu(a: Int) = if(a != 1) (a/2) + a%2 else a
}