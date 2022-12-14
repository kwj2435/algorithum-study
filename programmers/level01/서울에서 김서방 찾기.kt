package com.algo.programmers.level01

// 서울에서 김서방 찾기
// https://school.programmers.co.kr/learn/courses/30/lessons/12919
class P12919 {
    fun solution(a: IntArray, b: IntArray): Int {
        var answer = 0
        a.forEachIndexed{index, value ->
            answer += value * b[index]
        }
        return answer
    }
}