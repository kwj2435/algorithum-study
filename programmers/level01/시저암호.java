// 시저 암호
// https://school.programmers.co.kr/learn/courses/30/lessons/12926
public class 시저암호 {
  public String solution(String s, int n) {
    String answer = "";

    for(int i = 0 ; i<s.length() ; i++) {
      char temp = s.charAt(i);
      if(' ' == temp) {
        temp = (char)32;
      } else if (temp >= 'a' && temp <= 'z'){
        temp = (int) temp + n > 'z' ? (char) (97 + ((temp + n) % 122) - 1) : (char)(temp + n);
      } else {
        temp = (int) temp + n > 'Z' ? (char) (65 + ((temp + n) % 90) - 1) : (char)(temp + n);
      }
      answer = answer + temp;
    }

    return answer;
  }
}
