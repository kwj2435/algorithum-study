package com.algo.programmers.level01

// 하샤드 수
// https://school.programmers.co.kr/learn/courses/30/lessons/12947
class P12947 {
    fun solution(x: Int): Boolean {
        var tem = x
        var sum = 0
        while(tem != 0) {
            sum += tem%10
            tem /= 10
        }
        return if(x%sum == 0) true else false
    }
}