package com.algo.study.inflearn;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {
    @Test
    public void sortTest() {
        BubbleSort bubbleSort = new BubbleSort();

        int[] input1 = {3,4,5,1,2};
        int[] answer1 = {1,2,3,4,5};
        assertArrayEquals(answer1, bubbleSort.sort(input1));

        int[] input2 = {5,4,3,2,1};
        int[] answer2 = {1,2,3,4,5};
        assertArrayEquals(answer2, bubbleSort.sort(input2));
    }
}