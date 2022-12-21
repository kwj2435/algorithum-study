package com.algo.programmers.level01

// PermCheck
class PermCheck {
    fun solution(A: IntArray): Int {
        for(value in A) {
            if(value > A.size) break
            arr[value] = 1
        }

        return if(arr.filter { it == 1 }.sum() == A.size) 1 else 0
    }
}

