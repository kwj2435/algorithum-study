import java.util.*;

// 예산
// https://school.programmers.co.kr/learn/courses/30/lessons/12982
class P12982 {
    public int solution(int[] d, int budget) {
        Arrays.sort(d);
        var answer = 0;
        for(int i=0 ; i<d.length ; i++) {
            budget -= d[i];
            if(budget < 0) break;
            answer ++;
        }

        return answer;
    }
}