package com.algo.programmers.level01

// 짝수 홀수 개수
// https://school.programmers.co.kr/learn/courses/30/lessons/120824
class P120824 {
    fun solution(input: IntArray): IntArray {
        var answer: IntArray = IntArray(2){0}
        input.forEach{
            if(it%2 == 0) answer[0]++
            else answer[1]++
        }
        return answer
    }
}