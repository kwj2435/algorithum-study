// 개인정보 수집 유효기간
// https://school.programmers.co.kr/learn/courses/30/lessons/150370
class P150370 {
    public int[] solution(String today, String[] terms, String[] privacies) {
        List<Integer> answer = new LinkedList();
        String[] splitToday = today.split("\\.");
        Map<String, String> termsMap = new HashMap();

        for(String term: terms) {
           String[] splitTerm = term.split(" ") ;
           termsMap.put(splitTerm[0], splitTerm[1]);
        }

        int idx = 1;
        for(String privacy: privacies) {
            String[] splitPrivacy = privacy.split(" ");
            String[] splitPrivacyDate = splitPrivacy[0].split("\\.");

            int elapsedTime = (Integer.parseInt(splitToday[0]) - Integer.parseInt(splitPrivacyDate[0]))*336;
            elapsedTime += (Integer.parseInt(splitToday[1]) - Integer.parseInt(splitPrivacyDate[1]))*28;
            elapsedTime += Integer.parseInt(splitToday[2]) - Integer.parseInt(splitPrivacyDate[2]);

            if(elapsedTime >= Integer.parseInt(termsMap.get(splitPrivacy[1]))*28) {
                answer.add(idx);
            }
            idx++;
        }

        return answer.stream().mapToInt(i -> i).toArray();
    }
}
