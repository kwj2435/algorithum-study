package com.algo.study.programmers;

// 프로그래머스 Level 1 콜라즈 추측
public class DotProduct {
    public int solution(int[] a, int[] b) {
        int answer = 0;
        for(int i = 0 ; i < a.length ; i++) {
            answer += a[i] * b[i];
        }
        return answer;
    }
}
