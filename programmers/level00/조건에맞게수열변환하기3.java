// 조건에 맞게 수열 변환하기 3
// https://school.programmers.co.kr/learn/courses/30/lessons/181835
public class 조건에맞게수열변환하기3 {
  public int[] solution(int[] arr, int k) {
    boolean odd = k % 2 == 1;
    for(int i = 0 ; i<arr.length ; i++) {
      if(odd) { arr[i] *= k; }
      else { arr[i] += k; }
    }

    return arr;
  }
}
