package io.github.bfeng.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by bfeng on 7/18/16.
 */
public class LongestRepeatingSubstring extends Solution {
    public String longestRepeatingSubstring(String input) {
        int maxLength = 0;
        String longestSub = null;
        Set<String> set = new HashSet<>();
        String sub = null;
        for (int i = 0; i < input.length(); i++) {
            for (int j = i; j < input.length(); j++) {
                sub = input.substring(i, j + 1);
                if (i == 0 && j == input.length() - 1) continue;
                if (set.contains(sub)) {
                    if (sub.length() > maxLength) {
                        maxLength = sub.length();
                        longestSub = sub;
                    }
                } else
                    set.add(sub);
            }
        }
        return longestSub;
    }
}
