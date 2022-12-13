package com.algo.programmers.level02

// 최댓값과 최솟값
// https://school.programmers.co.kr/learn/courses/30/lessons/12939
class P12939 {
    fun solution(s: String): String {
        val splited = s.split(" ").map{ it.toInt() }
        return "${splited.minOf{it}} ${splited.maxOf{it}}"
    }
}