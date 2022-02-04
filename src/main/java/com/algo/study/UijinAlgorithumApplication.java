package com.algo.study;

import com.algo.study.inflearn.CorrectParenthesis;
import com.algo.study.inflearn.FlipWordOnlyAlphabet;
import com.algo.study.inflearn.InflearnStack2;
import com.algo.study.inflearn.InflearnStack3;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class UijinAlgorithumApplication {
    public static void main(String[] args) {
        InflearnStack3 stringCast = new InflearnStack3();

        int[][] input1 = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
        int[] input2 = {1,5,3,5,1,2,1,4};
        int result = stringCast.solution(input1, input2);

        System.out.println(result);
        SpringApplication.run(UijinAlgorithumApplication.class, args);
    }
}
