package com.algo.programmers.level01

// 음양 더하기
// https://school.programmers.co.kr/learn/courses/30/lessons/76501
class P76501 {
    fun solution(absolutes: IntArray, signs: BooleanArray): Int {
        var answer = 0
        for((index, value) in absolutes.withIndex()) {
            answer += if(signs[index]) value
            else value*(-1)
        }
        return answer
    }
}