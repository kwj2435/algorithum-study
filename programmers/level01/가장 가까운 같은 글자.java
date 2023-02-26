import java.util.*;

// 가장 가까운 같은 글자
// https://school.programmers.co.kr/learn/courses/30/lessons/142086
class P142086 {
    public int[] solution(String s) {
        Map<Character, Integer> map = new HashMap();
        char[] charArray = s.toCharArray();
        int[] answer = new int[charArray.length];

        for(int i = 0; i< charArray.length ; i++) {
            if(map.containsKey(charArray[i])) {
                answer[i] = (i+1) - map.get(charArray[i]);
            } else {
                answer[i] = -1;
            }
            map.put(charArray[i], i+1);
        }
        return answer;
    }
}