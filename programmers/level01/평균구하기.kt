package com.algo.programmers.level01

// 평균구하기
// https://school.programmers.co.kr/learn/courses/30/lessons/12944
class P12944 {
    fun solution(arr: IntArray): Int {
        var answer = 0.0
        arr.forEach{
            answer += it
        }
        return answer/arr.size
    }
}