package io.github.bfeng.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * Maximum length of sub-strings without repeating characters.
 */
public class LongestSubstringWithoutRepeatingCharacters extends Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.isEmpty())
            return 0;
        int maxLength = 0;

        Set<Character> set = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                if (set.contains(s.charAt(j))) {
                    maxLength = Math.max(maxLength, set.size());
                    set.clear();
                    break;
                } else
                    set.add(s.charAt(j));
            }
            if (s.length() - i < maxLength)
                break;
        }
        return maxLength;
    }
}
