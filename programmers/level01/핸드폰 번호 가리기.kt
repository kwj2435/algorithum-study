package com.algo.programmers.level01

// 핸드폰 번호 가리기
// https://school.programmers.co.kr/learn/courses/30/lessons/12948
class P12948 {
    fun solution(input: String): String {
        var answer = ""
        (0..input.length-5).forEach {
            answer += "*"
        }
        return answer + input.substring(input.length-4, input.length)
    }
}