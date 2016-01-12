package io.github.bfeng.leetcode;

/**
 * Created by bfeng on 1/8/16.
 */
public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        StringBuilder builder = new StringBuilder();
        char checker;
        boolean findNext = false;
        int index = 0;
        while (index < strs[0].length()) {
            checker = strs[0].charAt(index);
            findNext = true;
            for (int i = 1; i < strs.length; i++) {
                if (index >= strs[i].length() || checker != (strs[i].charAt(index))) {
                    findNext = false;
                    break;
                } else {
                    findNext = true;
                }
            }
            if (findNext) {
                builder.append(checker);
                index++;
            } else
                break;
        }
        return builder.toString();
    }
}
