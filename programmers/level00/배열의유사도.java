import java.util.Arrays;
import java.util.List;

// 배열의 유사도
// https://school.programmers.co.kr/learn/courses/30/lessons/120903
public class 배열의유사도 {
  public int solution(String[] s1, String[] s2) {
    int answer = 0;
    List<String> string2 = Arrays.asList(s2);

    for(String string : s1) {
      if(string2.contains(string)) answer ++;
    }

    return answer;
  }
}
