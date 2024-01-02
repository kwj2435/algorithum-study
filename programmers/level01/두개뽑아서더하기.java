import java.util.HashSet;
import java.util.Set;

//두 개 뽑아서 더하기
// https://school.programmers.co.kr/learn/courses/30/lessons/68644
public class 두개뽑아서더하기 {
  public int[] solution(int[] numbers) {
    Set<Integer> answer = new HashSet<>();

    for(int i = 0 ; i<numbers.length ; i++) {
      for(int k = i+1 ; k< numbers.length ; k++) {
        answer.add(numbers[i] + numbers[k]);
      }
    }
    return answer.stream().mapToInt(Integer::intValue).sorted().toArray();  // TreeSet을 더하면 자동으로 정렬될듯 하다
  }
}
