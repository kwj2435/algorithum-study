package com.algo.programmers.level01

// K번째수
// https://school.programmers.co.kr/learn/courses/30/lessons/42748
class P42748 {
    fun solution(array: IntArray, commands: Array<IntArray>): IntArray {
        var answer = IntArray(commands.size)
        for(i in commands.indices) {
            val tem = commands[i]
            answer[i] = array.slice(tem[0]-1..tem[1]-1).sorted()[tem[2]-1]
        }
        return answer
    }
}