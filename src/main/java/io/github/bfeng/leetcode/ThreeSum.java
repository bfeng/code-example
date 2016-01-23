package io.github.bfeng.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by bfeng on 1/9/16.
 */
public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        if (nums.length > 0) Arrays.sort(nums);
        else return new ArrayList<>();
        List<List<Integer>> results = new ArrayList<>();
        int a, b, c;
        for (int i = 0; i < nums.length; i++) {
            a = nums[i];
            if (a > 0) break;
            if (i > 0 && nums[i] == nums[i - 1])
                continue;
            int l = i + 1;
            int r = nums.length - 1;
            while (l < r) {
                b = nums[l];
                c = nums[r];
                int s = a + b + c;
                if (s < 0) l++;
                else if (s > 0) r--;
                else {
                    Integer[] array = {a, b, c};
                    List<Integer> arrList = Arrays.asList(array);
                    results.add(arrList);
                    while (l + 1 < r && nums[l] == nums[l + 1]) l++;
                    while (r - 1 > l && nums[r] == nums[r - 1]) r--;
                    l++;
                    r--;
                }
            }
        }
        return results;
    }
}
