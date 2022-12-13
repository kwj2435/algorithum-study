package com.algo.programmers.level02

// 이진 변환 반복하기
// https://school.programmers.co.kr/learn/courses/30/lessons/70129
class P70129 {
    fun solution(s: String): IntArray {
        var count = 0
        var zeroCount = 0
        var tem = s
        while(tem != "1") {
            count ++
            zeroCount += tem.count { it == '0'}
            tem = Integer.toBinaryString(tem.replace("0", "").length)
        }
        return intArrayOf(count, zeroCount)
    }
}