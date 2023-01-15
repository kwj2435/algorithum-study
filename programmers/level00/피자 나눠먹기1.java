import java.util.*;

// 피자 나눠먹기1
// https://school.programmers.co.kr/learn/courses/30/lessons/120814
class P120814 {
    public int solution(int n) {
        var pizza = 1;
        while(pizza*7 - n < 0) pizza ++;
        return pizza;
    }
}