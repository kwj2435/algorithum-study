package com.algo.programmers.level01

// 최소직사각형
// https://school.programmers.co.kr/learn/courses/30/lessons/86491
class P86491 {
    fun solution(sizes: Array<IntArray>): Int {
        var min = 0
        var max = 0

        sizes.forEach {
            val sorted = it.sorted()
            if(min < sorted[0]) min = sorted[0]
            if(max < sorted[1]) max = sorted[1]
        }

        return min*max
    }
}