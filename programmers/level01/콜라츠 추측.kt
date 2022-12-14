package com.algo.programmers.level01

// 콜라츠 추측
// https://school.programmers.co.kr/learn/courses/30/lessons/12943
class P12943 {
    fun solution(num: Int): Int {
        var tem = num.toLong()
        var answer = 0
        while(tem!=1L && answer != 500) {
            if(tem%2==0L) tem /= 2
            else tem = tem*3+1
            answer ++
        }
        return if(answer == 500) -1 else answer
    }
}