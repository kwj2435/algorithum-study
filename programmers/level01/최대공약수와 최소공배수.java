import java.util.*;

// 최대공약수와 최소공배수
// https://school.programmers.co.kr/learn/courses/30/lessons/12940
class P12940 {
    public int[] solution(int n, int m) {
        // 유클리드 호제법 이용
        var answer = new int[2];
        var temN = n;
        var temM = m;

        if(m > n) {
            temN = m;
            temM = n;
        }
        while(true) {
            var r = temN % temM;
            if (r == 0) {
                answer[0] = temM;
                break;
            }
            temN = temM;
            temM = r;
        }
        answer[1] = (n * m) / answer[0];

        return answer;
    }
}