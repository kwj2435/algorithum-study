package com.algo.study.programmers;

// 프로그래머스 Level 1 콜라즈 추측
public class Collatz {
    public int solution(int num) {
        long input = (long)num;
        for(int i = 0 ; i<500 ; i++) {
            if(input == 1) return i;
            if(input % 2 == 0) {
                input = input / 2;
            } else {
                input = input * 3 + 1;
            }
        }
        return -1;
    }
}

