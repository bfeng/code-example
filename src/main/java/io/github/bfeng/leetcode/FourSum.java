package io.github.bfeng.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by bfeng on 1/9/16.
 */
public class FourSum {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        if (nums.length > 0)
            Arrays.sort(nums);
        List<List<Integer>> results = new ArrayList<>();
        int a, b, c, d;
        for (int i = 0; i < nums.length; i++) {
            a = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                b = nums[j];
                for (int k = j + 1; k < nums.length; k++) {
                    c = nums[k];
                    for (int l = k + 1; l < nums.length; l++) {
                        d = nums[l];
                        if (a + b + c + d == target) {
                            results.add(Arrays.asList(a, b, c, d));
                        }
                    }
                }
            }
        }
        return results;
    }
}
