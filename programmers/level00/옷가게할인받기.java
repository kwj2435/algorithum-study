// 옷가게 할인 받기
// https://school.programmers.co.kr/learn/courses/30/lessons/120818
public class 옷가게할인받기 {
  public int solution(int price) {
    int answer = 0;

    if(price >= 500000) {
      answer = (int)(price - (price * 0.2));
    } else if(price >= 300000) {
      answer = (int)(price - (price * 0.1));
    } else if(price >= 100000) {
      answer = (int)(price - (price * 0.05));
    } else {
      answer = price;
    }

    return answer;
  }
}
