package com.algo.programmers.level01

// 바이러스
// https://www.acmicpc.net/problem/2606
class BP2606 {
    fun solution() = with(BufferedReader(InputStreamReader(System.`in`))) {
        val computers = readLine().split(" ")[0].toInt()
        val edge = readLine().split(" ")[0].toInt()

        for(i in 0 until edge) {
            val input = readLine().split(" ")
            val a = input[0].toInt()
            val b = input[1].toInt()
            graph[a][b] = 1
            graph[b][a] = 1
        }

        dfs(1, computers)
        println(visit.sum()-1)
    }

    private fun dfs(x: Int, computers: Int) {
        visit[x] = 1
        for(i in 1..computers) {
            if(visit[i] == 1 || graph[x][i] == 0) continue
            dfs(i, computers)
        }
    }
}