package com.algo.programmers.level01

// 수박수박수박수박수박수?
// https://school.programmers.co.kr/learn/courses/30/lessons/12922
class P12922 {
    fun solution(n: Int): String {
        return with(StringBuilder()) {
            (1..n).forEach {
                if(it % 2 != 0) append("수") else append("박")
            }
            toString()
        }
    }
}