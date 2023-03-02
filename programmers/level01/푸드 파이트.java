import java.util.*;

// 푸드 파이트
// https://school.programmers.co.kr/learn/courses/30/lessons/134240
class P1342405 {
    public String solution(int[] food) {
        StringBuilder sb = new StringBuilder();

        for(int i=0 ; i<food.length ; i++) {
            int foodCount = food[i]/2;
            for(int j=0 ; j<foodCount ; j++) {
                sb.append(i);
            }
        }

        String result = sb.toString();
        return result+"0"+sb.reverse();
    }
}
