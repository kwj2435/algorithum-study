package com.algo.programmers.level01

// x만큼 간격이 있는 n개의 숫자
// https://school.programmers.co.kr/learn/courses/30/lessons/12954
class P12954 {
    fun solution(x: Int, n: Int): LongArray {
        val answer = mutableListOf<Long>()
        for(i in 1..n){
            answer.add((x.toLong()*i.toLong()))
        }
        return answer.toLongArray()
    }
}