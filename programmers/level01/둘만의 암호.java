import java.util.*;

// 둘만의 암호
// https://school.programmers.co.kr/learn/courses/30/lessons/155652
class P155652 {
   class Solution {
    public String solution(String s, String skip, int index) {
        var sb = new StringBuilder();

        for(char c: s.toCharArray()) {
            var i = 0;
            while(i<index) {
                c++;
                if(c == 123) c = 97;
                if(skip.indexOf(c) == -1) {
                    i++;
                }
            }
            sb.append(c);
        }

        return sb.toString();
    }
}
