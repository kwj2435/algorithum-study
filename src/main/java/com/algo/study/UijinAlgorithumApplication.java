package com.algo.study;

import com.algo.study.inflearn.StringCast;
import com.algo.study.inflearn.WordInSentence;
import com.algo.study.programmers.Collatz;
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
        WordInSentence stringCast = new WordInSentence();

        stringCast.wordInSentence();

         SpringApplication.run(UijinAlgorithumApplication.class, args);
    }

}
