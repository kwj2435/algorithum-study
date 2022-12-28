import java.util.*;

// 문자열 내 p와 y의 개수
// https://school.programmers.co.kr/learn/courses/30/lessons/12916
class P12916 {
    boolean solution(String s) {
        var str = s.toLowerCase().toCharArray();
        var p = 0;
        var y = 0;
        for(char i : str) {
            if(i == 'p') p++;
            if(i == 'y') y++;
        }

        return p==y ? true : false;
    }
}