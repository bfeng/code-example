package io.github.bfeng.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by bfeng on 7/18/16.
 */
public class LongestSubstringWithoutRepeatingCharacters extends Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }
        int maxLength = 0;
        Set<Character> set = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                if (!set.contains(s.charAt(j))) {
                    set.add(s.charAt(j));
                } else
                    break;
            }
            if (set.size() > maxLength) {
                maxLength = set.size();
            }
            set.clear();

            if (s.length() - i < maxLength) // remaining length is less than maxLength
                break;
        }

        return maxLength;
    }
}
