import java.util.*;

// 최댓값 만들기1
// https://school.programmers.co.kr/learn/courses/30/lessons/120847
import java.util.Arrays;

class P120847 {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        return numbers[numbers.length-1] * numbers[numbers.length-2];
    }
}