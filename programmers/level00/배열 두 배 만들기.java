import java.util.*;

// 배열 두 배 만들기
// https://school.programmers.co.kr/learn/courses/30/lessons/120809
class P120809 {
    public int[] solution(int[] numbers) {
        var answer = new int[numbers.length];
        for(var i=0 ; i< numbers.length ; i++) {
            answer[i] = numbers[i]*2;
        }
        return answer;
    }
}