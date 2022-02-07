package com.algo.study.inflearn;

public class BubbleSort {
    public int[] sort(int[] unsortedArray) {
        for(int i = 0 ; i< unsortedArray.length ; i++) {
            for(int j = 0 ; j<unsortedArray.length-1 ; j++) {
                if(unsortedArray[j] > unsortedArray[j+1]) {
                    int tem = unsortedArray[j];
                    unsortedArray[j] = unsortedArray[j+1];
                    unsortedArray[j+1] = tem;
                }
            }
        }
        return unsortedArray;
    }
}
