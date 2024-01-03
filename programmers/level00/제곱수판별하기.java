// 제곱수 판별하기
// https://school.programmers.co.kr/learn/courses/30/lessons/120909
public class 제곱수판별하기 {
  public int solution(int n) {
    return n % Math.sqrt(n) == 0 ? 1 : 2;
  }
}
