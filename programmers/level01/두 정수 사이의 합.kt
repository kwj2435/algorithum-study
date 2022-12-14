package com.algo.programmers.level01

import kotlin.math.max
import kotlin.math.min

// 두 정수 사이의 합
// https://school.programmers.co.kr/learn/courses/30/lessons/12912
class P12912{
    fun solution(a: Int, b: Int): Long {
        val c = a.toLong()
        val d = b.toLong()
        return (min(c,d)..max(c,d)).sum().toLong()
    }
}