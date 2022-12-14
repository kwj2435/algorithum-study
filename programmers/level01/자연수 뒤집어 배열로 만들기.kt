package com.algo.programmers.level01

// 자연수 뒤집어 배열로 만들기
// https://school.programmers.co.kr/learn/courses/30/lessons/12932
class P12932 {
    fun solution(n: Long): IntArray {
        var length = 0
        var tem = n
        val list = mutableListOf<Int>()
        while(tem != 0L) {
            length++
            list.add((tem % 10).toInt())
            tem /= 10
        }
        return list.toIntArray()
    }
}