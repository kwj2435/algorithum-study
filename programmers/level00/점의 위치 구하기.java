import java.util.*;

// 점의 위치 구하기
// https://school.programmers.co.kr/learn/courses/30/lessons/120841
class P120841 {
    public int solution(int[] dot) {
        var answer = 1;

        if(dot[0] > 0 && dot[1] > 0) answer = 1;
        else if(dot[0] < 0 && dot[1] > 0) answer = 2;
        else if(dot[0] < 0 && dot[1] < 0) answer = 3;
        else answer = 4;

        return answer;
    }
}