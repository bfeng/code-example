package io.github.bfeng.leetcode;

import java.util.Set;

public class WordBreak extends Solution {
    public boolean wordBreak(String s, Set<String> dict) {
        if (s == null || s.isEmpty())
            return true;
        boolean[] results = new boolean[s.length() + 1];
        results[0] = true;
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j <= i; j++) {
                String sub = s.substring(j, i + 1);
                if(results[j] && dict.contains(sub)) {
                    results[j + 1] = true;
                    break;
                }
            }
        }
        return results[s.length()];
    }
}
