package com.algo.programmers.level01

// 문자열 다루기 기본
// https://school.programmers.co.kr/learn/courses/30/lessons/12918
class P12918 {
    fun solution(s: String): Boolean {
        if (s.length == 4 || s.length == 6) {
            val tem: String = s.replace("[^0-9]".toRegex(), "")
            return tem.length == s.length
        }
        return false
    }
}