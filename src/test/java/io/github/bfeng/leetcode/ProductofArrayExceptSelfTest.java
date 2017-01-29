package io.github.bfeng.leetcode;

import org.junit.Test;

/**
 * Created by bfeng on 8/1/16.
 */
public class ProductOfArrayExceptSelfTest {

    @Test
    public void testProductExceptSelf() throws Exception {
        ProductOfArrayExceptSelf solution = new ProductOfArrayExceptSelf();
        int[] nums = new int[]{
                1, 2, 3, 4
        };
        solution.productExceptSelf(nums);
    }
}