import java.util.*;

// 폰켓몬
// https://school.programmers.co.kr/learn/courses/30/lessons/1845
class P1845 {
    public int solution(int[] nums) {
        var set = new LinkedHashSet<Integer>();
        Arrays.stream(nums).forEach(set::add);

        return nums.length/2 <= set.size() ? nums.length/2 : set.size();
    }
}