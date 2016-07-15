package io.github.bfeng.leetcode;

/**
 * Created by bfeng on 7/14/16.
 */
public class ReverseString extends Solution {
    public String reverseString(String s) {
        char[] array = s.toCharArray();
        int i = 0;
        int n = array.length;
        char tmp;
        while (i < n / 2) {
            tmp = array[i];
            array[i] = array[n - i - 1];
            array[n - i - 1] = tmp;
            i++;
        }
        return new String(array);
    }
}
