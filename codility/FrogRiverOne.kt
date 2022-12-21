package com.algo.programmers.level01

// FrogRiverOne
// 문제설명이 좀 이상하다..
class FrogRiverOne {
    fun solution(X: Int, A: IntArray): Int {
        var max = 0
        A.forEach{
            if(it > max) max = it
        }
        return max + 1
    }
}