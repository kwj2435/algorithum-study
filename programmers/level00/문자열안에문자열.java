// 문자열안에 문자열
// https://school.programmers.co.kr/learn/courses/30/lessons/120908
public class 문자열안에문자열 {
  public int solution(String str1, String str2) {
    return str1.contains(str2) ? 1 : 2;
  }
}
