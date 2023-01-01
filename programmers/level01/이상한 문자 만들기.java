import java.util.*;

// 이상한 문자 만들기
// https://school.programmers.co.kr/learn/courses/30/lessons/12930
class P12930 {
    public String solution(String s) {
        var splited = s.split("");
        var count = 0;
        var sb = new StringBuilder(splited.length);

        for(var i : splited) {
            if(i.equals(" ")) {
                count = 0;
                sb.append(i);
                continue;
            }
            if(count % 2 == 0) {
                sb.append(i.toUpperCase());
            }else {
                sb.append(i.toLowerCase());
            }
            count ++;
        }

        return sb.toString();
    }
}