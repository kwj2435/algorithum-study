import java.util.*;

// 짝수의 합
// https://school.programmers.co.kr/learn/courses/30/lessons/120831
class P120831 {
    public int solution(int n) {
        var answer = 0;
        for(var i=1 ; i<=n ; i++) {
            if(i % 2 == 0) answer += i;
        }

        return answer;
    }
}