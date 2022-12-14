package com.algo.programmers.level01

// 제일 작은 수 제거하기
// https://school.programmers.co.kr/learn/courses/30/lessons/12935
class P12935 {
    fun solution(arr: IntArray): IntArray {
        return if(arr.size == 1) listOf(-1).toIntArray()
        else {
            val small = arr.sorted()[0]
            arr.filter { it != small }.toIntArray()
        }
    }
}