package com.algo.study.programmers;

import java.util.ArrayList;
import java.util.List;

// 프로그래머스 Level1 모의고사
// 5,7,9,10,12
public class MockExam {
    public int[] solution(int[] answers) {
        int[] student1 = {1,2,3,4,5};
        int[] student2 = {2,1,2,3,2,4,2,5};
        int[] student3 = {3,3,1,1,2,2,4,4,5,5};

        int[] counts = {0,0,0};
        List<Integer> rank = new ArrayList<>();

        for(int i = 0; i<answers.length ; i++) {
            if(student1[i % student1.length] == answers[i]) { counts[0] ++; }
            if(student2[i % student2.length] == answers[i]) { counts[1] ++; }
            if(student3[i % student3.length] == answers[i]) { counts[2] ++; }
        }

        for(int i = 0 ; i<counts.length ; i++) {
            if(i == 0) {
                rank.add(i + 1);
            }else if(counts[rank.get(0) - 1] == counts[i]){
                rank.add(i + 1);
            }else if(counts[rank.get(0) - 1] < counts[i]){
                rank.set(0, i + 1);
            }
        }

        int[] answer = new int[rank.size()];
        for(int i = 0 ; i<rank.size() ; i++) {
            answer[i] = rank.get(i);
        }
        return answer;
    }
}
