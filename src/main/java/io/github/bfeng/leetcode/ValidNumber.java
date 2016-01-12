package io.github.bfeng.leetcode;

/**
 * Created by bfeng on 1/10/16.
 */
public class ValidNumber {
    public boolean isNumber(String s) {
        int[][] states = {
                {0, 8, -1, -1, 8, -1, -1, 8, 8}, // space
                {2, -1, -1, -1, -1, 6, -1, -1, -1}, // sign
                {1, 1, 1, 4, 4, 7, 7, 7, -1}, // digit
                {3, 4, 3, -1, -1, -1, -1, -1, -1}, // dot
                {-1, 5, -1, -1, 5, -1, -1, -1, -1} // exponent
        };

        int state = 0;
        char c;
        int inputType = -1;
        for (int i = 0; i < s.length(); i++) {
            c = s.charAt(i);
            if (c == ' ') {
                inputType = 0;
            } else if (c == '+' || c == '-') {
                inputType = 1;
            } else if (c >= '0' && c <= '9') {
                inputType = 2;
            } else if (c == '.') {
                inputType = 3;
            } else if (c == 'e' || c == 'E') {
                inputType = 4;
            } else {
                inputType = -1;
            }
            if (inputType != -1) {
                state = states[inputType][state];
            }
            if (inputType == -1 || state == -1)
                return false;
        }
        return state == 1 || state == 4 || state == 7 || state == 8;
    }
}
