package com.algo.study.inflearn;

public class LeastRecentlyUsed {
    public int[] solution(int cacheSize, int[] jobs) {
        int[] cache = new int[cacheSize];

        for(int job : jobs) {
            int pos = -1;
            for(int i = 0 ; i<cacheSize ; i++) if(job == cache[i]) pos = i;
            // cache miss
            if(pos == -1) {
                for(int i = cacheSize -1 ; i>= 1 ; i--) {
                    cache[i] = cache[i-1];
                }
                cache[0] = job;
            } else {    // cache hit
                for(int i = pos ; i>=1; i--) {
                    cache[i] = cache[i-1];
                }
                cache[0] = job;
            }
        }

        return cache;
    }
}
