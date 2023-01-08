import java.util.*;

// 배열 원소의 길이
// https://school.programmers.co.kr/learn/courses/30/lessons/120821
class P120821 {
    public int[] solution(String[] strlist) {
        var answer = new int[strlist.length];

        for(var i=0 ; i<strlist.length ; i++) {
            answer[i] = strlist[i].length();
        }

        return answer;
    }
}