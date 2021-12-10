package com.algo.study.programmers;

// 프로그래머스 Level 1 키패드 누르기
public class KeyPad {
    public String solution(int[] numbers, String hand) {
        int[][] test = {{0,0},{0,1},{0,2},{1,0},{1,1},{1,2},{2,0},{2,1},{2,2},{3,0},{3,1},{3,2}};
        int curLeft = 10;
        int curRight = 12;
        String answer = "";

        for(int number : numbers) {
            if(number == 1 || number == 4 || number == 6) {
                curLeft = number;
                answer += "L";
            }else if(number == 3 || number == 6 || number == 9) {
                curRight = number;
                answer += "R";
            } else {    // 2,5,8,0 일 경우

            }
        }

        return answer;
    }
}


// 알고리즘 키패드 + 1 문제 , 펫코디 로그관리 작업까지