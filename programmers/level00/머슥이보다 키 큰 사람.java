import java.util.*;

// 머쓱이보다 키 큰 사람
// https://school.programmers.co.kr/learn/courses/30/lessons/120585
class P120585 {
    public int solution(int[] array, int height) {
        var answer = 0;
        for(var i : array) {
            if(i>height) answer ++;
        }

        return answer;
    }
}