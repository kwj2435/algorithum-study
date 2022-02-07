package com.algo.study.inflearn;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InsertSortTest {
    @Test
    public void insertSortTest() {
        InsertSort insertSort = new InsertSort();

        int[] input = {5,3,4,2,1};
        int[] answer = {1,2,3,4,5};

        assertArrayEquals(answer, insertSort.sort(input));
    }
}