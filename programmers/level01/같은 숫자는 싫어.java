import java.util.*;

// 같은 숫자는 싫어
// https://school.programmers.co.kr/learn/courses/30/lessons/12906
class P12906 {
    public int[] solution(int []arr) {
        List<Integer> list = new LinkedList();

        for(int i : arr) {
            if(list.isEmpty()) list.add(i);
            else {
                if(list.get(list.size()-1) != i) {
                    list.add(i);
                }
            }
        }
        return list.stream()
                .filter(Objects::nonNull)
                .mapToInt(Integer::intValue)
                .toArray();
    }
}