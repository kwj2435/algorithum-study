package com.algo.programmers.level01

// 나머지가 1이 되는 수 찾기
// https://school.programmers.co.kr/learn/courses/30/lessons/87389
class P87389 {
    fun solution(x: Int, n: Int): LongArray {
        fun solution(n: Int): Int {
            var tem = 1
            while(n%tem != 1) tem ++
            return tem
        }
    }
}