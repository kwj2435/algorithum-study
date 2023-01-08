import java.util.*;

// 배열 뒤집기
// https://school.programmers.co.kr/learn/courses/30/lessons/120821
class P120821 {
    public int[] solution(int[] num_list) {
        var answer = new int[num_list.length];

        for(var i=0 ; i<num_list.length ; i++) {
            answer[num_list.length-(i+1)] =  num_list[i];
        }

        return answer;
    }
}