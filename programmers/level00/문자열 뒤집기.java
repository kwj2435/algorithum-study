import java.util.*;

// 문자열 뒤집기
// https://school.programmers.co.kr/learn/courses/30/lessons/120822
class P120822 {
    public String solution(String str) {
        var sb = new StringBuilder();
        sb.append(str);
        return sb.reverse().toString();
    }
}