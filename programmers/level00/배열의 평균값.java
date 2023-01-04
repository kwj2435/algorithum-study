import java.util.*;

// 배열의 평균값
// https://school.programmers.co.kr/learn/courses/30/lessons/120817
class P120817 {
    public double solution(int[] numbers) {
        var answer = 0;
        for(var i : numbers) {
            answer += i;
        }
        return answer/(double)numbers.length;
    }
}