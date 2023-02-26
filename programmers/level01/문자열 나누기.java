import java.util.*;

// 문자열 나누기
// https://school.programmers.co.kr/learn/courses/30/lessons/140108
class P140108 {
    public int solution(String s) {
        Character firstLetter = null;
        int firstLetterCount = 0;
        int extraLetterCount = 0;
        int answer = 0;

        for(char c: s.toCharArray()) {
            if(firstLetterCount == 0) {
                firstLetter = c;
                firstLetterCount ++;
            } else if(firstLetter == c) {
                firstLetterCount ++;
            }
            if(firstLetter != c) {
                extraLetterCount ++;
            }
            if(firstLetterCount == extraLetterCount) {
                answer ++;
                firstLetter = null;
                firstLetterCount = 0;
                extraLetterCount = 0;
            }
        }
        if(firstLetterCount != extraLetterCount) answer ++;

        return answer;
    }
}