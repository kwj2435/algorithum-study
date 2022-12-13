package com.algo.algorithumstudy.programmers.level02

// JadenCase 문자열 만들기
// https://school.programmers.co.kr/learn/courses/30/lessons/12951
class P12951 {
    fun solution(s: String): String {
        return s.toLowerCase()
            .split(" ")
            .joinToString(" "){ it.replaceFirstChar{ it.uppercase()} }
    }
}