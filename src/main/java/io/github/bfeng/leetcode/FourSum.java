package io.github.bfeng.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given an array S of n integers, are there elements a, b, c, and d in S such that a + b + c + d = target? Find all
 * unique quadruplets in the array which gives the sum of target.
 * <p/>
 * Note:
 * Elements in a quadruplet (a,b,c,d) must be in non-descending order. (ie, a ≤ b ≤ c ≤ d)
 * The solution set must not contain duplicate quadruplets.
 */
public class FourSum {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        if (nums.length > 0)
            Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i <= nums.length - 4; i++) {
            if (i == 0 || nums[i] != nums[i - 1]) {
                for (int j = i + 1; j <= nums.length - 3; j++) {
                    if (j == i + 1 || nums[j] != nums[j - 1]) {
                        int low = j + 1;
                        int high = nums.length - 1;

                        while (low < high) {
                            int sum = nums[i] + nums[j] + nums[low] + nums[high];

                            if (sum > target) {
                                high--;
                            } else if (sum < target) {
                                low++;
                            } else if (sum == target) {
                                List<Integer> temp = new ArrayList<>();
                                temp.add(nums[i]);
                                temp.add(nums[j]);
                                temp.add(nums[low]);
                                temp.add(nums[high]);

                                result.add(temp);

                                low++;
                                high--;

                                while (low < high && nums[low] == nums[low - 1])//remove dupicate
                                    low++;
                                while (low < high && nums[high] == nums[high + 1])//remove dupicate
                                    high--;
                            }
                        }
                    }
                }
            }
        }

        return result;
    }
}
