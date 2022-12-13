package com.algo.algorithumstudy.programmers.level02

// 위장
// https://school.programmers.co.kr/learn/courses/30/lessons/42578
class P42578 {
    fun solution(clothes: Array<Array<String>>): Int {
        val map = mutableMapOf<String, MutableList<String>>().apply {
            clothes.forEach {
                if(containsKey(it[1])) {
                    val tem = get(it[1])
                    tem!!.add(it[0])
                    put(it[1], tem)
                }else {
                    val temList = mutableListOf<String>()
                    temList.add(it[0])
                    put(it[1],temList)
                }
            }
        }
        return map.values.fold(1) {acc,v -> acc*(v.size+1)}-1
    }
}