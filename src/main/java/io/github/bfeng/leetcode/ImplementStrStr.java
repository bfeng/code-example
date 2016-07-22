package io.github.bfeng.leetcode;

/**
 * Created by bfeng on 7/18/16.
 */
public class ImplementStrStr extends Solution {
    public int strStr(String haystack, String needle) {
        if(needle.isEmpty()) return 0;
        if(haystack.length() < needle.length()) return -1;
        int i = 0;
        int j = 0;
        while (i + j < haystack.length()) {
            if (needle.charAt(j) == haystack.charAt(i + j)) {
                j++;
                if (j == needle.length())
                    return i;
            } else {
                j = 0;
                i++;
            }
        }
        return -1;
    }
}
