package com.algo.algorithumstudy.programmers.level02

import java.util.*

// 괄호 회전하기
// https://school.programmers.co.kr/learn/courses/30/lessons/76502
class P76502 {
    fun solution(input: String): Int {
        var s = input
        var result = 0

        for(i in s.indices){
            var flag = true
            val stack = Stack<Char>()
            for(j in s.toCharArray()) {
                when (j) {
                    '[','(','{' -> stack.push(j)
                    ']' -> if(stack.empty() || stack.pop() != '[') flag = false
                    ')' -> if(stack.empty() || stack.pop() != '(') flag = false
                    '}' -> if(stack.empty() || stack.pop() != '{') flag = false
                }
            }
            if(flag && stack.empty()) result++
            s = rotateString(s)
        }
        return result
    }

    private fun rotateString(s: String): String {
        val tem = s.toCharArray().toMutableList()
        tem.add(tem[0])
        tem.remove(tem[0])

        return StringBuilder().apply {
            tem.forEach{append(it)}
        }.toString()
    }
}