package com.algo.programmers.level01

// 짝수와 홀수
// https://school.programmers.co.kr/learn/courses/30/lessons/12937
class P12937 {
    fun solution(num: Int): String {
        return if(num%2 == 0) "Even" else "Odd"
    }
}