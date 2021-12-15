package com.algo.study.programmers;

import java.util.HashMap;

// 프로그래머스 Level1 없는 숫자 더하기
public class AddNoNumber {
    public int solution(int[] numbers) {
        int answer = 0;
        for(int i = 0 ; i < 10 ; i++) {
            for(int j = 0 ; j < numbers.length ; j++) {
                if(i == numbers[j]) {
                    answer += numbers[j];
                }
            }
        }

        return 45 - answer;
    }
}
