package io.github.bfeng.leetcode;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertTrue;

/**
 * Created by bfeng on 1/9/16.
 */
public class FourSumTest {

    FourSum solution;

    @Before
    public void setUp() throws Exception {
        solution = new FourSum();
    }

    @Test
    public void testFourSum() throws Exception {
        int[] input = new int[]{1, 0, -1, 0, -2, 2};
        int target = 0;
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(-1, 0, 0, 1));
        expected.add(Arrays.asList(-2, -1, 1, 2));
        expected.add(Arrays.asList(-2, 0, 0, 2));

        List<List<Integer>> result = solution.fourSum(input, target);
        assertTrue(Utils.equalsWithoutOrder(expected, result));
    }

    @Test(timeout = 6)
    public void testFourSumLargeInput() throws Exception {
        int[] input = new int[]{-496, -487, -446, -421, -420, -411, -409, -400, -374, -353, -322, -317, -293, -290,
                -289, -279, -278, -260, -258, -257, -253, -247, -226, -198, -192, -182, -178, -174, -170, -163, -150,
                -145, -140, -115, -69, -58, -50, -40, -21, -16, -13, 5, 5, 39, 39, 43, 45, 83, 83, 94, 106, 107, 117,
                143, 166, 174, 178, 185, 185, 210, 228, 231, 239, 246, 247, 262, 300, 338, 340, 342, 344, 352, 353,
                359, 362, 363, 372, 375, 395, 400, 412, 414, 420, 429, 430, 431, 440, 441, 486};
        solution.fourSum(input, -2468);
    }
}