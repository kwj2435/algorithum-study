import java.util.*;

// 문자열 내림차순으로 배치하기
// https://school.programmers.co.kr/learn/courses/30/lessons/12917
class P12917 {
    public String solution(String s) {
        char[] tem = s.toCharArray();
        Arrays.sort(tem);

        StringBuilder answer = new StringBuilder(new String(tem));
        return answer.reverse().toString();
    }
}