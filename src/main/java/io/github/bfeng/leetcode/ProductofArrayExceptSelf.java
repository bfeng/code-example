package io.github.bfeng.leetcode;

import java.util.*;

/**
 * Created by bfeng on 8/1/16.
 */
public class ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        List<Integer> res = new ArrayList<>();
        for (int i = 1; i <= nums.length; i++) {
            for (int j = 0; j + i <= nums.length; j++) {
                System.out.println(j + ", " + (i + j) + ":");
                int result = 1;
                for (int k = j; k < i + j; k++) {
                    result *= nums[k];
                }
                res.add(result);
            }
        }
        Set<Integer> hash = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            hash.add(nums[i]);
        }
        List<Integer> cleanList = new ArrayList<>();
        for (Integer one : res) {
            if (!hash.contains(one))
                cleanList.add(one);
        }
        int[] ans = new int[cleanList.size()];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = cleanList.get(i);
        }
        System.out.println(Arrays.toString(ans));
        return ans;
    }
}
