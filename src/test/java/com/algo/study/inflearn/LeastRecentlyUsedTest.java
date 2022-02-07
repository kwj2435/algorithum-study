package com.algo.study.inflearn;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeastRecentlyUsedTest {
    @Test
    public void test() {
        LeastRecentlyUsed leastRecentlyUsed = new LeastRecentlyUsed();

        int[] input = {1,2,3,2,6,2,3,5,7};
        int[] result = leastRecentlyUsed.solution(5, input);
        int[] answer = {7,5,3,2,6};
        assertArrayEquals(answer, result);
    }
}