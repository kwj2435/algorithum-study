package com.algo.study.inflearn;

import java.util.Scanner;
import java.util.Stack;

// stack, queue 문제 올바른 괄호
public class CorrectParenthesis {
    public void correctParenthesis() {
        Scanner in=new Scanner(System.in);
        String input = in.next();
        Stack<Character> stack = new Stack<>();
        String result = "YES";

        for(char i : input.toCharArray()) {
            if(i == '(') stack.push(i);
            else{
                if(stack.isEmpty()) {
                    result = "NO";
                    break;
                }
                stack.pop();
            }
        }
        if(!stack.isEmpty()) result = "NO";
        System.out.println(result);
        return ;
    }
}
