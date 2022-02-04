package com.algo.study.inflearn;

import java.util.Scanner;
import java.util.Stack;

// 인프런 스택 2번째 괄호 문자 제거 문제
public class InflearnStack2 {
    public void solution() {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        Stack<Character> stack = new Stack<>();

        for(char i : str.toCharArray()) {
            if(i == ')') {
                while(stack.pop() != '(');
            }else {
                stack.push(i);
            }
        }
        String result = "";
        for(int i = 0 ; i<stack.size() ; i++) {
            result += stack.get(i);
        }
        System.out.println(result);
    }
}
