import java.util.*;

// 피자 나눠먹기3
// https://school.programmers.co.kr/learn/courses/30/lessons/120816
class P120816 {
    public int solution(int slice, int n) {
        var pizza = 1;
        while(pizza*slice - n < 0) pizza ++;
        return pizza;
    }
}