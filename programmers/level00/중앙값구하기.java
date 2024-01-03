import java.util.Arrays;

// 중앙값 구하기
// https://school.programmers.co.kr/learn/courses/30/lessons/120811
public class 중앙값구하기 {
  public int solution(int[] array) {
    return Arrays.stream(array).sorted().toArray()[array.length/2];
  }
}
