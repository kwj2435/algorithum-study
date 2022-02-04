package com.algo.study;

import com.algo.study.inflearn.CorrectParenthesis;
import com.algo.study.inflearn.FlipWordOnlyAlphabet;
import com.algo.study.inflearn.InflearnStack2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class UijinAlgorithumApplication {
    public static void main(String[] args) {
        InflearnStack2 stringCast = new InflearnStack2();

        stringCast.solution();

        SpringApplication.run(UijinAlgorithumApplication.class, args);
    }
}
