package com.algo.study.inflearn;

import java.util.Scanner;

// 대소문자 변환
public class StringCast {
    public void stringCast() {
        Scanner in = new Scanner(System.in);
        String input = in.next();
        StringBuffer result = new StringBuffer();
        for(char i : input.toCharArray()) {
            if(i >= 'a' && i <= 'z') result.append(Character.toUpperCase(i));
            else if(i >= 'A' && i <= 'Z') result.append(Character.toLowerCase(i));
        }

        System.out.println(result);
    }
}
