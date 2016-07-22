package io.github.bfeng.leetcode;

import io.github.bfeng.leetcode.tools.GeneralTestSuite;
import org.junit.Before;

public class LongestCommonPrefixTest extends GeneralTestSuite {

    LongestCommonPrefix solution;

    @Before
    public void setUp() throws Exception {
        solution = new LongestCommonPrefix();
    }

    @Override
    protected StringBuffer compute(StringBuffer input) {
        StringBuffer output = new StringBuffer();
        String[] inputArray = input.toString().split(",.+?");
        output.append(solution.longestCommonPrefix(inputArray));
        return output;
    }
}