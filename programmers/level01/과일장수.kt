package com.algo.programmers.level01

// 과일장수
// https://school.programmers.co.kr/learn/courses/30/lessons/135808
class P135808 {
    fun solution(k: Int, m: Int, score: IntArray): Int {
        var answer = 0
        val sortedScore = score.sorted()
        for(i in  (sortedScore.size % m) until score.size step m) {
            answer += sortedScore[i]*m
        }
        return answer
    }
}