package com.algo.programmers.level01

// 가운데 글자 가져오기
// https://school.programmers.co.kr/learn/courses/30/lessons/12903
class P12903 {
    fun solution(s: String): String {
        return if(s.length % 2 == 0) s.substring(s.length/2-1,s.length/2+1) else s.substring(s.length/2, s.length/2+1)
    }
}