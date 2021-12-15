package com.algo.study.programmers;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class RecommandIdTest {

    @Test
    @DisplayName("프로그래머스 Level 1 추천아이디")
    public void recommandIdTest() {
        RecommandId recommandId = new RecommandId();
        List<String> input = new ArrayList<>();
        List<String> answer = new ArrayList<>();

        input.add("...!@BaT#*..y.abcdefghijklm");
        input.add("z-+.^.");
        answer.add("bat.y.abcdefghi");
        answer.add("z--");

        for(int i = 0 ; i<input.size() ; i++) {
            String output = recommandId.solution(input.get(i));
            assertEquals(answer.get(i), output);
        }
    }
}