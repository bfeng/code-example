package io.github.bfeng.leetcode;

/**
 * Given a string S, find the longest palindromic substring in S. You may assume that the maximum length of S is
 * 1000, and there exists one unique longest palindromic substring.
 */
public class LongestPalindromicSubstring extends Solution {
    public String longestPalindrome(String s) {
        for (int start = 0; start < s.length(); start++) {
            int end = s.length();
            while(start < end) {
                String substring = s.substring(start, end);
                if (isPalindrome(substring))
                    return substring;
                end--;
            }
        }
        return null;
    }

    public boolean isPalindrome(String s) {
        char[] charArray = s.toCharArray();
        int i = 0;
        int mid = (s.length() - 1) / 2;

        while (i <= mid) {
            if(charArray[i] == charArray[s.length() - 1 - i]) {
                i++;
            } else {
                return false;
            }
        }
        return true;
    }
}
