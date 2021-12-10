package com.algo.study.programmers;

// 프로그래머스 Level 1 신규 아이디 추천
public class RecommandId {
    public String solution(String new_id) {
        String answer = new_id;

        answer = answer.toLowerCase();
        answer = answer.replaceAll("[^a-z-_.0-9]","");

        // 3단계 new_id에서 마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환합니다.
        answer = answer.replaceAll("\\.+", ".");
        // 4단계 new_id에서 마침표(.)가 처음이나 끝에 위치한다면 제거합니다.
        answer = removeFirstLast(answer);
        // 5단계 new_id가 빈 문자열이라면, new_id에 "a"를 대입합니다.
        if(answer.isEmpty() || answer == null) {
            answer = "a";
        }

        //6단계 new_id의 길이가 16자 이상이면, new_id의 첫 15개의 문자를 제외한 나머지 문자들을 모두 제거합니다.
        if(answer.length() > 15) {
            answer = answer.substring(0, 15);
            answer = removeFirstLast(answer);
        }

        //7단계 new_id의 길이가 2자 이하라면, new_id의 마지막 문자를 new_id의 길이가 3이 될 때까지 반복해서 끝에 붙입니다.
        if(answer.length() < 3) {
            char lastChar = answer.charAt(answer.length() - 1);
            while(answer.length() < 3) {
                answer = answer + lastChar;
            }
        }
        return answer;
    }

    private String removeFirstLast(String answer) {

        if(!answer.isEmpty() && answer.charAt(0) == '.') {
            answer = answer.substring(1);
        }
        if(!answer.isEmpty() && answer.charAt(answer.length() - 1) == '.') {
            answer = answer.substring(0, answer.length() - 1);
        }

        return answer;
    }
}
