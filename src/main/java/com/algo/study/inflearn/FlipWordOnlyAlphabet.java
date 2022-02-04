package com.algo.study.inflearn;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

// 단어 뒤집기
public class FlipWordOnlyAlphabet {
    public void flipWord() {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        str = str.toUpperCase();

        int l = 0;
        int r = str.length()-1;

        while(l < r) {
            if(str.charAt(l) != str.charAt(r)) {
                System.out.println("NO");
                return;
            }
            else {
                l++;
                r--;
            }
        }
        System.out.println("YES");
    }
}
