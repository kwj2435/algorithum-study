package com.algo.programmers.level01

// 체육복
// https://school.programmers.co.kr/learn/courses/30/lessons/42862
class P42862 {
    fun solution(n: Int, lost: IntArray, reserve: IntArray): Int {
        var answer = n
        val filteredLost = lost.toSortedSet() - reserve.toSet()
        val filteredReserve = (reserve.toSet() - lost.toSet()).toSortedSet().toMutableSet()
        for(i in filteredLost) {
            if(filteredReserve.contains(i-1)) {
                filteredReserve.remove(i-1)
            }else if(filteredReserve.contains(i+1)) {
                filteredReserve.remove(i+1)
            }else{
                answer--
            }
        }

        return answer
    }
}