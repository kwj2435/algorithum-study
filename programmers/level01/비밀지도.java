// [1차] 비밀지도
// https://school.programmers.co.kr/learn/courses/30/lessons/17681
public class 비밀지도 {
  public String[] solution(int n, int[] arr1, int[] arr2) {
    String[] answer = new String[n];

    for(int i = 0 ; i<n ; i++) {
      StringBuilder temArr = new StringBuilder(Integer.toBinaryString(arr1[i] | arr2[i]));

      while(temArr.length() < n) {
        temArr.insert(0, "0");
      }

      answer[i] = temArr.toString();
      answer[i] = answer[i].replace("0", " ");
      answer[i] = answer[i].replace("1", "#");
    }

    return answer;
  }
}
