import java.util.*;

// 아이스 아메리카노
// https://school.programmers.co.kr/learn/courses/30/lessons/120819?language=java
class P120819 {
    public int[] solution(int money) {
        var answer = new int[]{0,0};
        while(money-5500 >= 0) {
            answer[0] ++;
            money -= 5500;
        }
        answer[1] = money;

        return answer;
    }
}