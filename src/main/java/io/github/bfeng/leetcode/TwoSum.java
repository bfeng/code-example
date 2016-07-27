package io.github.bfeng.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by bfeng on 7/24/16.
 */
public class TwoSum extends Solution {

    public int[] twoSum(int[] input, int target) {
        if (input == null)
            return null;
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input.length; j++) {
                if (input[i] + input[j] == target) {
                    return new int[]{i + 1, j + 1};
                }
            }
        }
        return null;
    }

    public int[] twoSumHash(int[] input, int target) {
        if (input == null)
            return null;
        Map<Integer, Integer> hash = new HashMap<>();

        for (int i = 0; i < input.length; i++) {
            int expected = target - input[i];
            hash.put(expected, i);
        }

        for (int i = 0; i < input.length; i++) {
            Integer j = hash.get(input[i]);
            if (j != null && i != j)
                return new int[]{i + 1, j + 1};
        }
        return null;
    }

    public int[] twoSumSort(int[] input, int target) {
        if (input == null)
            return null;
        Arrays.sort(input);
        int left = 0;
        int right = input.length - 1;
        while (left < right) {
            int total = input[left] + input[right];
            if (total > target)
                right--;
            else if (total < target)
                left++;
            else
                return new int[]{left + 1, right + 1};
        }
        return null;
    }
}
