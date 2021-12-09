package com.algo.study.programmers;

// 프로그래머스 Level 1 로또의 최고 순위와 최저 순위
public class LottoRank {
    public int[] LottoRank(int[] lottos, int[] win_nums) {
        int matchCount = 0;
        int zeroCount = 0;
        int[] answer = new int[2];

        for(int number : lottos) {
            // 입력된 로또 번호가 0이 아니면서 맞을 경우
            if(number != 0) {
                for(int winNum : win_nums) {
                    if(number == winNum) {
                        matchCount ++;
                    }
                }
            } else {
                zeroCount++;
            }
        }

        answer[0] = getRank(matchCount + zeroCount);
        answer[1] = getRank(matchCount);

        return answer;
    }

    public int getRank(int matchCount) {
        if(matchCount == 1) {
            return 6;
        } else if(matchCount == 2) {
            return 5;
        } else if(matchCount == 3) {
            return 4;
        } else if(matchCount == 4) {
            return 3;
        } else if(matchCount == 5) {
            return 2;
        } else if(matchCount == 6) {
            return 1;
        }
        return 6;
    }
}
