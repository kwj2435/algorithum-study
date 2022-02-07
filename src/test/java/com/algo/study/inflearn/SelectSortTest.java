package com.algo.study.inflearn;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SelectSortTest {
    @Test
    public void selectSortTest() {
        SelectSort selectSort = new SelectSort();

        int[] input1 = {3,4,5,1,2};
        int[] answer1 = {1,2,3,4,5};
        assertArrayEquals(answer1, selectSort.solution(input1));
    }
}