import java.util.*;

// 문자열 내 마음대로 정렬하기
// https://school.programmers.co.kr/learn/courses/30/lessons/12915
class P12915 {
    public String[] solution(String[] strings, int n) {
        for(var i=0 ; i<strings.length ; i++) {
            strings[i] = strings[i].charAt(n) + strings[i];
        }
        Arrays.sort(strings);
        for(var i=0 ; i<strings.length ; i++) {
            strings[i] = strings[i].substring(1,strings[i].length());
        }
        return strings;
    }
}