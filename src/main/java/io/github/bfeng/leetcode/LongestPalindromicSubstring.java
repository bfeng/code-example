package io.github.bfeng.leetcode;

/**
 * Given a string S, find the longest palindromic substring in S. You may assume that the maximum length of S is
 * 1000, and there exists one unique longest palindromic substring.
 */
public class LongestPalindromicSubstring extends Solution {
    public String longestPalindrome(String s) {
        for (int len = s.length(); len > 0; len--) {
            for (int start = 0; start + len <= s.length(); start++) {
                if (isPalindrome(s, start, start + len - 1)) {
                    return s.substring(start, start + len);
                }
            }
        }
        return null;
    }

    private boolean isPalindrome(String s) {
        char[] charArray = s.toCharArray();
        int i = 0;
        int mid = (s.length() - 1) / 2;

        while (i <= mid) {
            if (charArray[i] == charArray[s.length() - 1 - i]) {
                i++;
            } else {
                return false;
            }
        }
        return true;
    }

    private boolean isPalindrome(String s, int start, int end) {
        char[] charArray = s.toCharArray();
        int mid = (end - start) / 2 + start;
        while (start <= mid) {
            if (charArray[start] == charArray[end]) {
                start++;
                end--;
            } else
                return false;
        }
        return true;
    }
}
