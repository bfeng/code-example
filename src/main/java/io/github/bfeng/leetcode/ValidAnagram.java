package io.github.bfeng.leetcode;

public class ValidAnagram {
    public boolean validAnagram(String s, String t) {
        if(s == null || t == null || s.isEmpty() || t.isEmpty() || s.length() != t.length())
            return false;

        int[] dict = new int[26];
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            dict[c - 'a']++;
        }
        for(int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            dict[c - 'a']--;
        }

        for(int i = 0; i < dict.length; i++) {
            if(dict[i] != 0)
                return false;
        }
        return true;
    }
}
