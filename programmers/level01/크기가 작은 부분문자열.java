import java.util.*;

// 크기가 작은 부분문자열
// https://school.programmers.co.kr/learn/courses/30/lessons/147355
class P147355 {
    public int solution(String t, String p) {
        var answer = 0;

        for(int i = 0; i<t.length()-p.length()+1; i++){
            var tem = t.substring(i, i+p.length());
            if(Long.parseLong(tem) <= Long.parseLong(p)) answer ++;
        }

        return answer;
    }
}