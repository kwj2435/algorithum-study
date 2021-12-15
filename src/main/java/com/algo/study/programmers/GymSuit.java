package com.algo.study.programmers;

import java.util.Arrays;

// 프로그래머스 Level 1 콜라즈 추측
public class GymSuit {
    /**
     *
     * @param n     전체 학생 수
     * @param lost  도난당한 학생들의 번호
     * @param reserve 여벌의 체육복을 가져온 학생들 번호
     * @return
     */
    public int[] sort(int[] arr) {
        for(int i = 0 ; i<arr.length; i++) {
            for(int j = 0 ; j<arr.length -1; j++) {
                if(arr[j] > arr[j] + 1) {
                    int tem = arr[j];
                    arr[j] = arr[i];
                    arr[i] = tem;
                }
            }
        }
        return arr;
    }
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0 ;
        answer += n - lost.length;

        lost = sort(lost);
        reserve = sort(reserve);

        for(int i = 0 ; i<lost.length ; i++) {
            // 여벌 가져온 학생이 도난 당했는지 판단
            for (int j = 0; j < reserve.length; j++) {
                if (lost[i] == reserve[j]) {
                    lost[i] = -1;
                    reserve[j] = -1;
                    answer += 1;
                    break;
                }
            }
        }
        for(int i = 0 ; i<lost.length ; i++) {
            for(int j = 0; j<reserve.length ; j++) {
                if(lost[i] == reserve[j] + 1 || lost[i] == reserve[j] - 1) {
                    reserve[j] = -1;
                    answer += 1;
                    break;
                }
            }
        }
        return answer;
    }
}
