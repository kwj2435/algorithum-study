package com.algo.study.inflearn;

import java.util.Scanner;

public class SelectSort {
    public int[] solution(int[] unsortedArray) {
        for(int j = 0 ; j<unsortedArray.length ; j++) {
            for(int k = j ; k<unsortedArray.length ; k++) {
                if(unsortedArray[j] > unsortedArray[k]) {
                    int tem = unsortedArray[j];
                    unsortedArray[j] = unsortedArray[k];
                    unsortedArray[k] = tem;
                }
            }
        }
        return unsortedArray;
    }
}
