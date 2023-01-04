import java.util.*;

// 양꼬치
// https://school.programmers.co.kr/learn/courses/30/lessons/120830
class P120830 {
    public int solution(int n, int k) {
        return (n*12000) + (k-(n/10))*2000;
    }
}