package com.algo.study.inflearn;

import java.util.Scanner;
import java.util.Stack;

// stack 카카오 크레인 인형뽑기
public class InflearnStack3 {
    public int solution(int[][] board, int[] moves) {
        Stack<Integer> bucket = new Stack();
        int result = 0;
        // moves 반복
        for(int i = 0 ; i<moves.length ; i++) {
            int catchItem = 0;
            int movePos = moves[i]-1;
            // 인형 뽑기
            for(int j = 0 ; j<board.length ; j++) {
                if(board[j][movePos] != 0) {
                    catchItem = board[j][movePos];
                    board[j][movePos] = 0;
                    break;
                }
            }
            // bucket 담긴 중복 인형 제거
            if(catchItem != 0) {
                if(!bucket.isEmpty() && catchItem == bucket.peek()) {
                    bucket.pop();
                    result += 2;
                } else {
                    bucket.push(catchItem);
                }
            }
        }
        return result;
    }
}
