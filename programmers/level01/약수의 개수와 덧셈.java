import java.util.*;

// 약수의 개수와 덧셈
// httphttps://school.programmers.co.kr/learn/courses/30/lessons/77884
class P77884 {
    public int solution(int left, int right) {
        var answer = 0;
        for (int i=left;i<=right;i++) {
            //제곱수인 경우 약수의 개수가 홀수
            if (i % Math.sqrt(i) == 0) {
                answer -= i;
            }
            //제곱수가 아닌 경우 약수의 개수가 짝수
            else {
                answer += i;
            }
        }

        return answer;
    }
}