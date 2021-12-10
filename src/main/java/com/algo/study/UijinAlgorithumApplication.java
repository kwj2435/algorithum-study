package com.algo.study;

import com.algo.study.programmers.LottoRank;
import com.algo.study.programmers.RecommandId;
import com.sun.org.apache.xerces.internal.xs.XSTypeDefinition;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;

@SpringBootApplication
public class UijinAlgorithumApplication {
    public static void main(String[] args) {
        RecommandId recommandId = new RecommandId();
        String answer = "........................";

        String response = recommandId.solution(answer);

        SpringApplication.run(UijinAlgorithumApplication.class, args);
    }

}
