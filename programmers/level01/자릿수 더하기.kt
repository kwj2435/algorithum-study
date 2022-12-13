package com.algo.programmers.level01

// 자릿수 더하기
// https://school.programmers.co.kr/learn/courses/30/lessons/12931
class P12931 {
    fun solution(n: Int): Int {
        var answer = 0
        var tem = n
        while(tem != 0) {
            answer += tem%10
            tem = tem/10
        }
        return answer
    }
}