import java.util.*;

// 중복된 숫자 갯수
// https://school.programmers.co.kr/learn/courses/30/lessons/120583
class P120583 {
    public int solution(int[] array, int n) {
        return (int)Arrays.stream(array).filter(i -> i==n).count();
    }
}