import java.util.*;

// 명예의 전당(1)
// https://school.programmers.co.kr/learn/courses/30/lessons/138477
class P138477 {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        int min = 0;
        List<Integer> rank = new LinkedList<>();

        for(int i=0 ; i< score.length ; i++) {
            if(i==0) min=score[i];
            if(rank.size() < k) {
                rank.add(score[i]);
            }else {
                if(min <score[i]) {
                    rank.remove(0);
                    rank.add(score[i]);
                }
            }
            Collections.sort(rank);
            min = rank.get(0);
            answer[i] = min;
        }
        return answer;
    }
}