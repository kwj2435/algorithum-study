package com.algo.algorithumstudy.programmers.level02

// 카펫
// https://school.programmers.co.kr/learn/courses/30/lessons/42842
class P42842 {
    fun solution(brown: Int, yellow: Int): IntArray {
        val total = brown + yellow
        var i = 1
        var result: IntArray = intArrayOf()
        while(total > i) {
            if(total % i == 0) {
                val x = total/i
                val y = i
                if(y >= x && (x-2)*(y-2)==yellow) {
                    result = intArrayOf(i, total/i)
                }
            }
            i++
        }
        return result
    }
}