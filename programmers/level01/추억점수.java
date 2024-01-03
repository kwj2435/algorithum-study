import java.util.HashMap;
import java.util.Map;

// 추억 점수
// https://school.programmers.co.kr/learn/courses/30/lessons/176963
public class 추억점수 {
  public int[] solution(String[] name, int[] yearning, String[][] photo) {
    int[] answer = new int[photo.length];
    Map<String, Integer> map = new HashMap<>();


    for(int i = 0 ; i<name.length ; i++) {
      map.put(name[i], yearning[i]);
    }

    for (int i = 0 ; i<photo.length ; i++) {
      for (String string : photo[i]) {
        if (map.get(string) != null) {
          answer[i] += map.get(string);
        }
      }
    }

    return answer;
  }
}
