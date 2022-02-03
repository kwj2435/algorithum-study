package com.algo.study.inflearn;

import java.util.Scanner;

public class WordInSentence {
    public void wordInSentence() {
        Scanner in=new Scanner(System.in);
        String input = in.nextLine();

        String[] splitedInput = input.split(" ");
        int result = 0;
        for(int i = 0; i<splitedInput.length - 1 ; i++) {
            if(splitedInput[i].length() < splitedInput[i+1].length()) {
                result = i+1;
            }
        }
        System.out.println(splitedInput[result]);
    }
}
