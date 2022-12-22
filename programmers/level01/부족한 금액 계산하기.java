import java.util.*;

// 부족한 금액 계산하기
// https://school.programmers.co.kr/learn/courses/30/lessons/82612
class P82612 {
    public long solution(int price, int money, int count) {
        long increasePrice = price;
        long sum = 0;
        for(int i = 0; i<count ; i++) {
            sum += increasePrice;
            increasePrice += price;
        }

        return (money-sum <0 ? -(money-sum) : 0);
    }
}