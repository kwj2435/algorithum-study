import java.util.*;

// 행렬의 덧셈
// https://school.programmers.co.kr/learn/courses/30/lessons/12950
class P12916 {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        var answer = new int[arr1.length][arr1[0].length];

        for(var i=0 ; i<arr1.length ; i++) {
            for(var j=0 ; j<arr1[0].length ; j++) {
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        return answer;
    }
}