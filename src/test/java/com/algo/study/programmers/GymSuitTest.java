package com.algo.study.programmers;

import org.junit.jupiter.api.Test;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GymSuitTest {

    @Test
    void gumSuitTest() {
        GymSuit gymSuit = new GymSuit();
        List<Integer> ns= new ArrayList<>();
        List<int[]> losts = new ArrayList<>();
        List<int[]> reservess = new ArrayList<>();
        List<Integer> expectes = new ArrayList<>();

        ns.add(5);
        ns.add(5);
        ns.add(6);
        ns.add(3);
        ns.add(5);
        ns.add(10);
        ns.add(5);
        ns.add(5);

//        losts.add(new int[]{2,4});
//        losts.add(new int[]{2,4});
        losts.add(new int[]{6,2,4});
//        losts.add(new int[]{1,2});
//        losts.add(new int[]{4,3});
//        losts.add(new int[]{5,7,9});
//        losts.add(new int[]{2,4});
//        losts.add(new int[]{3,5});
//        losts.add(new int[]{9,7,5});

//        reservess.add(new int[]{1,3,5});
//        reservess.add(new int[]{3});
        reservess.add(new int[]{1,5,3});
//        reservess.add(new int[]{2,3});
//        reservess.add(new int[]{3,2});
//        reservess.add(new int[]{1,2,3,4,6,8});
//        reservess.add(new int[]{5,3});
//        reservess.add(new int[]{2,4});
//        reservess.add(new int[]{2,4});
//        reservess.add(new int[]{4,3,2,8,6,1});

//        expectes.add(5);
//        expectes.add(4);
        expectes.add(5);
//        expectes.add(2);
//        expectes.add(4);
//        expectes.add(10);
//        expectes.add(5);
//        expectes.add(5);
//        expectes.add(4);

        for(int i = 0 ; i<ns.size() ; i++) {
            int answer = gymSuit.solution(ns.get(i), losts.get(i), reservess.get(i));
            System.out.println(i + 1);
            assertEquals(expectes.get(i), answer, ()->"fail");
        }

    }
}