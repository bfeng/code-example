package io.github.bfeng.leetcode;

/**
 * Created by bfeng on 1/7/16.
 */
public class ZigzagConversion {

    public String convert(String s, int numRows) {
        if (numRows <= 1) return s;
        StringBuilder builder = new StringBuilder();
        int len = s.length();
        for (int i = 0; i < numRows; i++) {
            for (int j = 0, index, inner; ; j++) {
                index = 2 * (numRows - 1) * j + i;
                if (index >= len) {
                    break;
                }
                builder.append(s.charAt(index));
                if (i == 0 || i == numRows - 1) continue;
                inner = index + (numRows - i - 1) * 2;
                if (inner < len)
                    builder.append(s.charAt(inner));
            }
        }
        return builder.toString();
    }
}
