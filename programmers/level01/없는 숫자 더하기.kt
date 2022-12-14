package com.algo.programmers.level01

// 없는 숫자 더하기
// https://school.programmers.co.kr/learn/courses/30/lessons/86051
class P86501 {
    fun solution(numbers: IntArray): Int {
        return (0..9).filter { numbers.contains(it).not() }.sum()
    }
}