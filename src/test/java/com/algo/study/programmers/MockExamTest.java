package com.algo.study.programmers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MockExamTest {

    @Test
    void MockExam() {
        MockExam mockExam = new MockExam();

        int[] answer = mockExam.solution(new int[]{1, 2, 3, 1, 2});

        assertEquals(new int[]{1}, answer);
    }
}