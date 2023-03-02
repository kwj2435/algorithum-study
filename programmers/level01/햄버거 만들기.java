import java.util.*;

// 햄버거 만들기
// https://school.programmers.co.kr/learn/courses/30/lessons/133502
class P133502 {
    public int solution(int[] ingredient) {
        List<Integer> stack = new LinkedList<>();
        int answer = 0;

        for(int i: ingredient) {
            stack.add(i);
            if(stack.size() >= 4) {
                if(stack.get(stack.size()-1) == 1
                && stack.get(stack.size()-2) == 3
                && stack.get(stack.size()-3) == 2
                && stack.get(stack.size()-4) == 1) {
                    answer ++;
                    stack.remove(stack.size()-1);
                    stack.remove(stack.size()-1);
                    stack.remove(stack.size()-1);
                    stack.remove(stack.size()-1);
                }
            }
        }
        return answer;
    }
}
