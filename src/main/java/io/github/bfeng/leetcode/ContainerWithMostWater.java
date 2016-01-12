package io.github.bfeng.leetcode;

/**
 * Created by bfeng on 1/7/16.
 */
public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int max = 0;
        int area = 0;
        int start = 0;
        int end = height.length - 1;
        while (start < end) {
            area = Math.min(height[start], height[end]) * (end - start);
            if (area > max) {
                max = area;
            }
            if (height[start] < height[end]) {
                start++;
            } else {
                end--;
            }
        }
        return max;
    }
}
