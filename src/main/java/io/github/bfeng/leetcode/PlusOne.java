package io.github.bfeng.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bfeng on 1/2/16.
 */
public class PlusOne {
    public int[] plusOne(int[] digits) {
        List<Integer> digitList = new ArrayList<>(digits.length);
        for (int digit : digits) {
            digitList.add(digit);
        }

        boolean increment = true;

        for (int i = digitList.size() - 1; i >= 0; i--) {
            int digit = digitList.get(i);
            if (digit < 9) {
                digitList.set(i, digit + 1);
                increment = false;
                break;
            } else {
                digitList.set(i, 0);
            }
        }
        if (increment) {
            digitList.add(0);
            digitList.set(0, 1);
        }

        int[] digitArray = new int[digitList.size()];
        for (int i = 0; i < digitArray.length; i++) {
            digitArray[i] = digitList.get(i);
        }
        return digitArray;
    }
}
