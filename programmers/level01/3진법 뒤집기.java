import java.util.*;

// 3진법 뒤집기
// https://school.programmers.co.kr/learn/courses/30/lessons/68935
class P68935 {
    public int solution(int n) {
        var answer = 0;

        var three = change(n);
        var multi = 1;
        for(int i = three.length()-1 ; i >= 0 ; i--){
            answer += Character.getNumericValue(three.charAt(i)) * multi;
            multi *= 3;
        }

        return answer;
    }

    private String change(int input) {
        var sb = new StringBuilder();
        while(input != 0) {
            sb.append(input%3);
            input /= 3;
        }
        return sb.toString();
    }
}