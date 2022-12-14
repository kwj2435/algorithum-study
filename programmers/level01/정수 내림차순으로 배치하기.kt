package com.algo.programmers.level01

// 정수 내림차순으로 배치하기
// https://school.programmers.co.kr/learn/courses/30/lessons/12933
class P12933 {
    fun solution(n: Long): Long {
        val list = mutableListOf<Long>().apply{
            var tem = n
            while(tem!=0L) {
                add(tem%10L)
                tem /= 10
            }
        }
        list.sortDescending()
        var answer = 0L
        list.forEach{
            answer = answer*10L+it
        }
        return answer
    }
}