package com.algo.programmers.level01

// 약수의 합
// https://school.programmers.co.kr/learn/courses/30/lessons/12928
class P12938 {
    fun solution(n: Int): Int {
        var answer = 0
        var i = 1
        while(i <= n) {
            if(n%i == 0) answer += i
            i++
        }
        return answer
    }
}