package com.algo.programmers.level02

// 타겟 넘버
// https://school.programmers.co.kr/learn/courses/30/lessons/43165
class P43165 {
    fun solution(numbers: IntArray, target: Int): Int {
        var tree = arrayListOf(0)
        numbers.forEach { value ->
            var child = arrayListOf<Int>()
            tree.forEach { i ->
                child.add(i+value)
                child.add(i-value)
            }
            tree = child
        }
        return tree.filter { it == target }.count()
    }
}