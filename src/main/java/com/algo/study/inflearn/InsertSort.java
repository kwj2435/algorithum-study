package com.algo.study.inflearn;

public class InsertSort {
    public int[] sort(int[] unsortedArray) {
        for(int i = 1 ; i< unsortedArray.length ; i++) {
            for(int j = i ; j>0 ; j--) {
                if(unsortedArray[j] < unsortedArray[j-1]) {
                    int tem = unsortedArray[j-1];
                    unsortedArray[j-1] = unsortedArray[j];
                    unsortedArray[j] = tem;
                }
            }
        }
        return unsortedArray;
    }
}
