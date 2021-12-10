package com.algo.study;

import com.algo.study.programmers.KeyPad;
import com.algo.study.programmers.LottoRank;
import com.algo.study.programmers.RecommandId;
import com.sun.org.apache.xerces.internal.xs.XSTypeDefinition;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;

@SpringBootApplication
public class UijinAlgorithumApplication {
    public static void main(String[] args) {
        KeyPad keyPad = new KeyPad();
        int[] answer = {7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2};
        String hand = "left";

        String response = keyPad.solution(answer, hand);

         SpringApplication.run(UijinAlgorithumApplication.class, args);
    }

}
